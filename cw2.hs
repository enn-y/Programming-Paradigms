import Data.Text.Internal.Fusion.Common (replicateCharI)
import Data.Char (digitToInt)
-- Muhammad Fadil Amin Bin Arsani 
-- 20515959


-- 1
-- the function takes a string and only takes 
-- the run of repeated characters. Only works for one character
chomp :: String -> String
chomp " " = " "
chomp (x:xs) = takeWhile(== x) (x:xs)


-- 2
-- takes 9 repeated characters 
munch :: String -> String
munch = take 9.chomp


-- 3
-- drop the number of length of munch from the list and calls back the function runs
-- put everything back in a new list
runs :: String -> [String]
runs "" = []
runs xs =  munch xs : runs (drop (length(munch xs)) xs)


-- 4
-- using zip to couple char and its repitition
encode :: String -> [(Char,Int)]
encode "" = []
-- encode xs = zip [head ch | ch <- runs xs] [length y  | y <- runs xs]
-- code below is the compressed version of the code directly above:
encode xs = [(head v, length v) | v <- runs xs]

-- 5
-- clet = the letter
-- cnum = the corresponding number
-- prints the letter and concatenate it with their corresponding number and recalls the function
flatten :: [(Char,Int)] -> String
flatten [] = []
flatten ((clet,cnum): xs) = clet : (show cnum ++ flatten xs)

-- 6
compress :: String -> String
compress xs = flatten(encode xs)

-- 7
-- used the hint
-- use replicate function and concatenate it with the result of the previous function call
decode :: [(Char,Int)] -> String
decode [] = []
decode ((x,y): xs)= replicate y x ++ decode xs

-- 8
-- used the hint
-- convert char to Int
-- recall function and concatenate it to the result of the previous function call
expand :: String -> [(Char,Int)]
expand [] = []
expand (x:y:zs) = (x,digitToInt y)  : expand zs

-- 9
decompress :: String -> String
decompress xs = decode(expand xs)

