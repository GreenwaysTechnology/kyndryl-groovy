def person = 'Subramanian'
def partner = switch (person) {
    case 'Subramanian' -> 'Geetha'
    case 'Romeo' -> 'Juliet'
    case 'Adam' -> 'Eve'
    case 'Antony' -> 'Cleopatra'
}
println(partner)