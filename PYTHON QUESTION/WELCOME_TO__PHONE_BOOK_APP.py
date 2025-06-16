print("WELCOME_TO__PHONE_BOOK_APP")
print("LIST OF MENU FUNCTIONS")

contacts = [] 


while True:
    print("""
MENU
    1. Add contact.
    2. Remove contact.
    3. Find contact by first name.
    4. Find contact by last name.
    5. Edit contact.
    """)

    choice = input('Enter your choice (1 to 5): ')

    if choice == "1":
        name = input("Enter name: ")