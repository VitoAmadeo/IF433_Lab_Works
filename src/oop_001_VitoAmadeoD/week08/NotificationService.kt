package oop_001_VitoAmadeoD.week08

class NotificationService
{
    fun sendEmail(emailAddress: String)
    {
        println("Sending email to $emailAddress")
    }

    fun processUser(user: userProfile)
    {
        if(user.email!=null)
        {
            sendEmail(emailAddress = user.email)
        }
        else
        {
            println("User does not have an email")
        }
    }
}