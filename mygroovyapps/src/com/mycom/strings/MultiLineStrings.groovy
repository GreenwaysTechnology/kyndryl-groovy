//java style
String doc = "<html>" +
        "<head>" +
        "<title>" +
        "</head>" +
        "<body>" +
        "<h1>Hello</h1>" +
        "</body></html>";
println doc

//Groovy Style : ''' '''

def htmlDoc = '''
    <html>
    <head>
      <title>Hello</title>
    </head>
    <body>.
        <h1>Hello</h1>
    </body>
    </html>
'''
println htmlDoc

//Multi line string with interploation
def title="Home"
def text = "Welcome to My Site"

def htmlnewDoc = """
    <html>
    <head>
      <title>${title}</title>
    </head>
    <body>.
        <h1>${text}</h1>
    </body>
    </html>
"""
println htmlnewDoc
