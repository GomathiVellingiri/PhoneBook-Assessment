# PhoneBook-Assessment
Save User Details:
http://localhost:8080/saveUserInfo
Post Method
{
    "firstName":"Anu",
    "lastName":"saran",
    "emailId":"anusaran@gmail.com"
   
}
-----------------------------------------------------------------------------------
Save User Contact Details:
Post Method
http://localhost:8080/saveUserContact
{
   "phoneNumber":"8012942942",
   "alternameNumber":"8012345687",
   "user":{
       "userId":1
   }
}
--------------------------------------------------------------------------------------
Get All Users:
Get Method
http://localhost:8080/getAllUsers
-------------------------------------------------------------------------------------

Update User Details:
Post method
http://localhost:8080/updateUserInfo
{
    "userId":1,
    "firstName":"deepti",
    "lastName":"saran",
    "emailId":"123abc@gmail.com"
}
----------------------------------------------------------------------------------
