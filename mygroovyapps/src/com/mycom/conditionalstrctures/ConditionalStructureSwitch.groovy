def x = 34
def result = ""
switch (x) {
    case "foo":
        result = "found foo";
        break;
    case "bar":
        result = "bar"
        break
    case [4, 5, 7, 'hello']:
        result = "list"
        break
    case 12..50:
        result = "range"
        break
    case Number:
        result = "Number"
        break
    case ~/fo*/:
        result = "Regular expression"
        break
    default:
        result = "No Match found"
        break
}
println(result)
