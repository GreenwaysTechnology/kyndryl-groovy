//How to escape special character

//Hello ! how are you ? \ i am fine what " about you

//here special characters not allowed directly here
def quote = "Hello ! How are you ? \\ i am fine what \" about you "
println(quote)
quote = 'Hello ! How are you ? \\\\ i am fine what \\" about you '
println(quote)

//unicode character
def price = "Price in Euro \u20AC"
println(price)
