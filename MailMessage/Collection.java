package MailMessage;

/*
 * COLLECTION
 * Version is 1.0
 * Created on 24/07/2015
 * Updated on 02/09/2015
 * 
 * Description:
 * Insert a description here.
 */

import java.util.*;

public class Collection {

	private ArrayList<Message> messages = new ArrayList<Message>();

	public ArrayList<Message> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

	public Collection() {
		createCollection();
	}

	/**
	 * @desc Creates an ArrayList to store all the Message objects and adds them
	 *       to the ArrayList(messages)
	 */
	public void createCollection() {

		/*
		 * Android
		 */

		// 50 Characters
		// -----------------------------------------------------------"

		messages.add(new Message("langauge and Input on Andriod",
				"Please goto Settings on your mobile device\nThen Input and Langague\nand change the Langauge to your perfered Country\n"
						+ "Then close the App and reopen it.",
				"android", "lang", "langs", "languages"));
		messages.add(new Message("How to clear data for the Android application     ",
				"Please could you:\n" + "\n" + "1. Go to your Android 'Settings'\n" + "\n"
						+ "2. Find and click on 'Application Manager'\n" + "\n" + "3. Go to the 'Downloaded section'\n"
						+ "\n" + "4. Find and click on the DailyMail application\n" + "\n"
						+ "5. Click on 'Clear Data' and press 'Ok'\n" + "\n"
						+ "After you have followed all the steps above, please open the application again,\n"
						+ "and let me know if this has resolved your issue.",
				"Android", "android,image,images,clear,data"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to hide Android keyboard to submit comments   ",
				"Once you have typed your message out that you want to comment, simply tap the\n"
						+ "back button on your phone once, and the keyboard should hide out of view.\n" + "\n"
						+ "After the keyboard is hidden, you should be able to access and click the Submit\n"
						+ "button to publish your comment.\n" + "\n" + "Let me know if this information helps.",
				"Android", "android,keyboard,comment,comments"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Suggest a new feature for the Android application ",
				"Thank you for your feedback regarding new features for the Android application.\n" + "\n"
						+ "I have already contacted the Android Development team regarding your\n"
						+ "suggestions, and it will be considered for future updates of the DailyMail\n"
						+ "application for Android.",
				"Android", "android,suggest,suggestion,feature,feedback"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Android Developers are aware of this specfic issue",
				"The Android development team are aware of this issue, and are looking to resolve\n"
						+ "this during the next update for the Android application.\n" + "\n"
						+ "Apologies for any inconvenience caused.",
				"Android", "android,issue,issues,aware,bug,error"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Android Developers have identified the issue      ",
				"We have identified the problem causing the issue.\n" + "\n"
						+ "The Android Development team will be releasing a fix for this in the next update\n"
						+ "for the Android application.\n" + "\n"
						+ "For now I would recommend using the DailyMail website till this issue is\n"
						+ "resolved on our side. "
						+ "However, you can still continue to use the Android application if the issue\n"
						+ "is not causing too much trouble.\n" + "\n"
						+ "I apologise for the trouble caused, and I hope you continue to enjoy the content\n"
						+ "provided.",
				"Android", "android,issue,issues,aware,identify,identified"));

		// Messages.add(new Message("Android update comments"))

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Feature is not on the Android application yet     ",
				"Currently, this feature is not available on the Android application.\n" + "\n"
						+ "However, I have already contacted the Android Development team regarding this\n"
						+ "feature, and it will be considered for future updates on the DailyMail application for\n"
						+ "Android.\n" + "\n"
						+ "Although this feature is not currently available, I do hope you continue to\n"
						+ "enjoy the content provided.",
				"Android", "android,feature,features,unavailable"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to clear cache & delete cookies for Android   ",
				"Please follow the instructions below to clear your browser cache, and delete\n"
						+ "your browser cookies on your Android device:\n" + "\n" + "1. Open your web browser\n" + "\n"
						+ "2. Go to your browsers 'Settings'\n" + "\n" + "3. Tap 'Privacy'\n" + "\n"
						+ "4. Tap 'Clear Browsing Data'\n" + "\n"
						+ "5. Make sure the Cache, and the Cookies box is ticked\n" + "\n" + "6. Click 'Clear'\n" + "\n"
						+ "After you have followed the above instructions, let me know if your issue has\n"
						+ "resolved.",
				"Android", "android,clear,delete,cookie,cookies,cache,browser,web,website"));

		messages.add(new Message("Android Layout Changes",
				"The MailOnline App layout issue has been noticed,\n "
						+ "I had already forwarded this on the android developers and they are looking to changing  the design.\n"
						+ " However there is a long process of approval  which needs to be fulfilled.\n"
						+ " Before any designs are released to the public.\n"
						+ " I can only suggest that you wait for the update that would fix the layout of the App.",
				"Android", "Layout", "Lay", "Sugggest", "layout"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to stop images appearing between article text ",
				"There is an option on the DailyMail application for Android that allows you to\n"
						+ "put all the images in an article at the end as thumbnails. By doing this you\n"
						+ "won't experience any images appearing in-between text while reading an article.\n" + "\n"
						+ "To achieve this, simply follow the below steps:\n" + "\n"
						+ "1. Open the DailyMail application for Android\n" + "\n"
						+ "2. Click the three dots placed vertically in the top right corner of the\n"
						+ "   application and go to 'Settings'\n" + "\n"
						+ "3. Under the 'Syncing' header, enable the option called 'Images in articles'\n" + "\n"
						+ "All articles you open now should have the images displayed at the end of the\n"
						+ "article instead of in-between text.",
				"Android", "android,image,images,article,text,inbetween,make,setting,settings"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Positive feedback for the Android application     ",
				"We are happy to hear your positive experiences from using the DailyMail Android\n" + "application.\n"
						+ "\n" + "Thank you for your support, and I hope you continue to enjoy using the Android\n"
						+ "application with the content provided.",
				"Android", "android,positive,feedback,happy"));

		/*
		 * Apple
		 */

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to clear cache & delete cookies for iPhone    ",
				"Please follow the instructions below to clear your browser cache, and delete\n"
						+ "your browser cookies on your iPhone device:\n" + "\n"
						+ "1. From the home screen, tap the 'Settings' button\n" + "\n"
						+ "2. Go to your browsers 'Settings'\n" + "\n"
						+ "3. On the Settings screen, scroll down and tap the 'Safari' button\n" + "\n"
						+ "4. Under the 'Privacy' section, tap 'Clear Cookies and Data'\n" + "\n"
						+ "5. On the confirmation screen, tap 'Clear Cookies and Data'\n" + "\n"
						+ "After you have followed the above instructions, let me know if your issue has\n"
						+ "resolved.",
				"Apple", "iphone,apple,clear,delete,cookie,cookies,cache,browser,web,website"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to clear cache & delete cookies for iPad      ",
				"Please follow the instructions below to clear your browser cache, and delete\n"
						+ "your browser cookies on your iPad device:\n" + "\n"
						+ "1. From the home screen, tap the 'Settings' button\n" + "\n"
						+ "2. Go to your browsers 'Settings'\n" + "\n"
						+ "3. On the Settings screen, scroll down and tap the 'Safari' button'\n" + "\n"
						+ "4. Under the 'Privacy' section, tap 'Clear Cookies and Data'\n" + "\n"
						+ "5. On the confirmation screen, tap 'Clear Cookies and Data'\n" + "\n"
						+ "After you have followed the above instructions, let me know if your issue has\n"
						+ "resolved.",
				"Apple", "ipad,apple,clear,delete,cookie,cookies,cache,browser,web,website"));

		/*
		 * Forward
		 */

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Forward user to communities@dailymailonline.co.uk ",
				"Apologies for the issues you are experiencing.\n" + "\n"
						+ "For any issues relating to comments or accounts, please email\n"
						+ "community@dailymailonline.co.uk.\n" + "\n"
						+ "They will be able to investigate and help solve any problems you are having.",
				"Forward", "forward,community,communities"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Forward user to iphoneapp@mailonline.co.uk        ",
				"Apologies for the issues you are experiencing with the application.\n" + "\n"
						+ "For any issues relating to the iPhone/iPad DailyMail application, please email\n"
						+ "iphoneapp@mailonline.co.uk.\n" + "\n"
						+ "They will be able to investigate and help solve any problems you are having.",
				"Forward", "forward,apple,iphone,ipad"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Forward user to editorial@mailonline.co.uk        ",
				"For any issues relating to articles, such as the contents displayed in them,\n"
						+ "please email editorial@mailonline.co.uk.\n" + "\n"
						+ "They will be able to investigate and help you with any problems you are having.",
				"Forward", "forward,editorial,article,articles,grammar,spelling,mistake"));

		/*
		 * Misc
		 */

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Can you confirm if this issue is still happening? ",
				"Are you still experiencing this issue?\n" + "\n" + "I apologise for any inconvenience caused.", "Misc",
				"misc,issue,occur,occurring,experience,experiencing"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Can you explain the issue in more detail?         ",
				"Please could you explain in more detail about the issue you are having?\n" + "\n"
						+ "By doing so, we will be able to investigate and resolve any of the problems you\n"
						+ "are having.",
				"Misc", "misc,issue,detail,details,explain"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Try clearing web browsers cache & delete cookies  ",
				"Could you please try clearing your web browsers cache, and deleting your web\n"
						+ "browsers cookies to see if that resolves the issue.\n" + "\n"
						+ "Please let me know how you get on, or if you require help with the above\n"
						+ "instructions.",
				"Misc", "misc,clear,delete,cookie,cookies,cache,browser,web,website"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Unable to find registered account under email     ",
				"I have searched the accounts system, and I was unable to locate any account\n"
						+ "registered under your email address.\n" + "\n"
						+ "Did you fully complete the registration process when signing up with your email?\n" + "\n"
						+ "Or, did you maybe register an account with a different email address?\n" + "\n"
						+ "Apologies for the inconvenience caused.",
				"Misc", "misc,register,registered,account,email,profile,web"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Advert is malicious and being shown with content  ",
				"I sincerely apologise for this malicious advertisement. Rest assured, these\n"
						+ "ads did NOT come from us. Rather, they were shown when a malicious advertiser\n"
						+ "took advantage of an exploit on a 3rd party advertisement platform that we use.\n"
						+ "When discovered, we immediately shut them off and notified our advertisement\n"
						+ "team who are taking action accordingly.\n" + "\n"
						+ "Again, I apologise for the trouble caused.",
				"Misc", "misc,malicious,ad,ads,advertisement,advertisements,advert,adverts"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Advert still popping up for you on content?       ",
				"Are you still receiving this particular advertisement when viewing content on\n" + "the DailyMail?",
				"Misc", "misc,ad,ads,advertisement,advertisements,advert,adverts,pop,popup,pop-up"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("User unable to receive a password reset email     ",
				"An account does appear to exist in our system under your listed email address.\n" + "\n"
						+ "When you doing a password reset, make sure that your email address is typed in\n"
						+ "all lowercase. If the email contains any uppercases, then the email will be\n"
						+ "processed as not valid, and you will not receive a password reset email.\n" + "\n"
						+ "So as an example, 'Bob@dailymail.com' should be typed as 'bob@dailymail.com'.\n" + "\n"
						+ "Let me know if this helps.",
				"Misc", "misc,password,passwords,pass,reset,email"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to change your email address on your account  ",
				"In order to change your email address, login with your current email on the\n" + "DailyMail website.\n"
						+ "\n" + "After that, follow the simple steps below:\n" + "\n" + "1. Go to 'My Profile'\n"
						+ "\n" + "2. Click on 'Edit my profile & preferences'\n" + "\n"
						+ "3. At the text box called 'Email Address', click on 'Change email'\n" + "\n"
						+ "4. Enter your new email address and password, then click 'Save changes'\n" + "\n"
						+ "Please let me know if this helps.",
				"Misc", "misc,email,address,profile,account,change,update,edit"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Is there an application for any Windows devices?  ",
				"Currently there isn't an official release of a DailyMail application for Windows\n" + "devices.\n"
						+ "\n" + "Unfortunately, there are no plans as of yet to create an application for devices\n"
						+ "that use Windows, although this is definitely a possibility in the near future.",
				"Misc", "misc,windows,window,application,app,available,mobile"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("User account disable request completed response   ",
				"I have deactivated your DailyMail account as requested, and you should now no\n"
						+ "longer be able to login using your existing details.",
				"Misc", "misc,email,account,disable,deactivate"));

		/*
		 * Web
		 */

		// 50 Characters
		// -----------------------------------------------------------"

		messages.add(new Message("Website suggestion",
				"Thank you for your feedback regarding  the  Website"
						+ " I have already contacted the  Web Development team regarding your suggestions,"
						+ " and it will be considered for future updates of the DailyMail",
				"Web", "suggestion", "web"));

		messages.add(new Message("Website developers are aware of this issue        ",
				"The development team are aware of this issue, and are looking to resolve this\n"
						+ "during the next website update.\n" + "\n" + "Apologies for any inconvenience caused.",
				"Web", "web,website,issues,aware"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to stop website from constantly refreshing    ",
				"I apologise for the inconvenience caused from the constant page refreshing.\n" + "\n"
						+ "With regards to resolving the issue, are your date and time settings on your\n"
						+ "device set correctly?\n" + "\n"
						+ "By this I mean is your device set to your local timezone (local time for the\n"
						+ "country you are living in), and is the time and day set accurately?\n" + "\n"
						+ "If some of your settings are set incorrectly, then please correct them. After you\n"
						+ "have done this, please enter the DailyMail website, and let me know if the\n"
						+ "page has stopped refreshing constantly.",
				"Web", "web,website,refresh,refreshing,date,time,timezone,error,bug"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Unable to see profile picture when uploading image",
				"Currently, all user profiles have been 'masked' with a default profile image. This\n"
						+ "means that the last profile image that was uploaded to a user's profile is being\n"
						+ "covered up by this 'default image'.\n"
						+ "The reason this was done was due to changes being done on our systems.\n"
						+ "This large change/update is still undergoing, and so all users profile images will\n"
						+ "remain as a default picture. Once this update has been completed, all user\n"
						+ "profile images will return to whatever was uploaded last.\n" + "\n"
						+ "Profile images can still be uploaded, however, they will not physically appear\n"
						+ "for now, as they are currently being masked by the default image as explained\n" + "above.\n"
						+ "\n" + "I apologise for the inconvenience as this has been an on-going process for a\n"
						+ "while.",
				"Web", "web,website,profile,image,appear,upload"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("CoffeeBreak channel has not been updated          ",
				"Currently, the CoffeeBreak page is not being updated and is being withheld from\n"
						+ "having updates for now.\n" + "\n"
						+ "The reason for this is because it is highly possible that the CoffeeBreak page\n"
						+ "will be removed from the DailyMail website.\n" + "\n"
						+ "I apologise for not being able to do the puzzles that the page used to provide\n"
						+ "daily.\n" + "\n"
						+ "However, I do hope this answers your question(s) about the CoffeeBreak/Puzzles\n" + "page.",
				"Web", "web,website,coffee,break,coffeebreak,update,updated"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to clear cache & delete cookies for Apple OS  ",
				"Please find your browser below, and follow the instructions to clear your\n"
						+ "browser cache, and delete your browser cookies on your Apple operating system.\n" + "\n"
						+ "SAFARI\n" + "\n"
						+ "1. Click Safari in the upper left hand side of your screen. In the menu that\n"
						+ "     appears, click 'Preferences'\n" + "\n"
						+ "2. In the window that appears, click the 'Privacy' tab\n" + "\n"
						+ "3. Click the button 'Remove All Website Data'\n" + "\n"
						+ "4. Click 'Remove Now' in the pop up window that appears\n" + "\n"
						+ "5. Close and reopen Safari\n" + "\n" + "\n" + "GOOGLE CHROME\n" + "\n"
						+ "1. Click Chrome in the upper left hand side of your screen. In the menu that\n"
						+ "     appears, click 'Clear Browsing Data'\n" + "\n"
						+ "2. Select 'the beginning of time' in the drop down box, and click on the\n"
						+ "     'Clear Browsing Data' button\n" + "\n" + "3. Close and reopen Google Chrome\n" + "\n"
						+ "\n" + "FIREFOX\n" + "\n"
						+ "1. Click on 'Tools', then on the drop down list, click 'Clear Recent History'\n" + "\n"
						+ "2. Click on the drop down box to the right of 'Time range to clear' and select\n"
						+ "     'Everything'.\n" + "\n" + "3. Click on 'Details' and check both 'Cookies' and 'Cache'\n"
						+ "\n" + "4. Click on 'Clear Now'\n" + "\n" + "5. Close and reopen FireFox\n" + "\n"
						+ "After you have followed the above instructions, let me know if your issue has\n"
						+ "resolved.",
				"Web", "apple,clear,delete,cookie,cookies,cache,browser,web,website,mac,macos,macosx,osx"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to clear cache & delete cookies for Windows OS",
				"Please find your browser below, and follow the instructions to clear your\n"
						+ "browser cache, and delete your browser cookies on your Windows operating system.\n" + "\n"
						+ "INTERNET EXPLORER\n" + "\n"
						+ "1. Click 'Internet Options' from Internet Explorer's Settings\n" + "\n"
						+ "2. Select 'Delete Browsing History'\n" + "\n" + "3. Select 'Cookies'\n" + "\n"
						+ "4. Click 'Delete All' and then confirm by clicking 'Yes'\n" + "\n"
						+ "5. Close and reopen Internet Explorer\n" + "\n" + "\n" + "GOOGLE CHROME\n" + "\n"
						+ "1. Click the Chrome menu button (the 3 vertical lines) on the browser toolbar\n" + "\n"
						+ "2. Select 'More tools'\n" + "\n" + "3. Select 'Clear browsing data'\n" + "\n"
						+ "4. Set 'Obliterate the following items from:' to 'beginning of time'\n" + "\n"
						+ "5. Tick the boxes for emptying Cache and deleting Cookies\n" + "\n"
						+ "6. Click 'Clear browsing data'\n" + "\n" + "7. Close and reopen Google Chrome\n" + "\n"
						+ "\n" + "FIREFOX\n" + "\n" + "1. Click the FireFox menu button (the 3 vertical lines)\n" + "\n"
						+ "2. Select 'Options'\n" + "\n" + "3. Select the 'Advanced' panel\n" + "\n"
						+ "4. Click on the 'Network' tab\n" + "\n"
						+ "5. In the 'Cached Web Content' section, click 'Clear Now'\n" + "\n"
						+ "6. Close and reopen FireFox\n" + "\n"
						+ "After you have followed the above instructions, let me know if your issue has\n"
						+ "resolved.",
				"Web", "window,windows,clear,delete,cookie,cookies,cache,browser,web,website"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("How to unsubscribe to newsletters on the website  ",
				"Have you set your newsletter preferences in your account so you don\'t receive\n"
						+ "any type of newsletter to your email address?\n" + "\n"
						+ "If you are unsure, please follow the below steps. If you believe you have done\n"
						+ "this already, please double check you have covered everything in the below\n"
						+ "instructions.\n" + "\n" + "1. Go to \'My Profile\'\n" + "\n"
						+ "2. Click on \'Edit my profile & preferences\'\n" + "\n"
						+ "3. Click on \'Change newsletters preferences\'\n" + "\n"
						+ "4. Untick all the boxes under the \'Newsletters\' and \'Breaking newsflashes\'\n"
						+ "   columns\n" + "\n"
						+ "5. Tick the last three boxes that begin with \'I do not wish to receive...\'\n" + "\n"
						+ "6. Click on \'Confirm changes\'",
				"Web", "web,newsletter,newsletters,unsubscribe,subscription,email,emails"));

		// 50 Characters
		// -----------------------------------------------------------"
		messages.add(new Message("Positive feedback for the DailyMail website       ",
				"We are happy to hear your positive experiences from using the DailyMail website.\n" + "\n"
						+ "Thank you for your support, and I hope you continue to enjoy using the website\n"
						+ "along with the content provided.",
				"Web", "web,website,positive,feedback,happy"));

		// 50 Characters
		// -----------------------------------------------------------"

		messages.add(new Message("Why can't i donwload the app", "Thank you for emailing android support,\n" +

				" Please attempt to download the app for the play store by following this link:" +

				"https://play.google.com/store/apps/details?id=com.dailymail.online&hl=en_GB\n" +

				" if you have any problems please send over a screenshot  showing the error message.", "Android"));

		messages.add(new Message("iphone or android not appearing",
				"Hello\n\nThank you for your email. There is no issue with "
						+ "your account and comments usually take longer to appear on mobile apps so if your comment is already live "
						+ "in the desktop site please be assured that it will shortly "
						+ "appear on the mobile apps.\n\nPlease do not hesitate to contact us "
						+ "should you continue to experience difficulties.\n\nKind Regards,\n",
				"Mobile apps"));

		messages.add(new Message("Comments on web not appearing.",
				"Hello\n\nThanks for your email. \n\nMailOnline has grown significantly "
						+ "over the last year and continues to grow in popularity.  As a result we also have a higher number of comments submitted every day. "
						+ " Where articles on comments are moderated we make every effort to review as many comments as possible.  Unfortunately there can"
						+ " sometimes be a delay between a comment being published and it appearing or because your comment does not agree to the house rules."
						+ " \n \nFor more information regarding this please refer to our House Rules:\nhttp://www.dailymail.co.uk/home/article-1388145/House-Rules.html\n \nWe "
						+ "hope you continue to enjoy using the app and " + "reading its contents.\n\nKind regards,\n",
				"web"));
		
		messages.add(new Message("Unable to locate account", "Thank you for emailing android support,\nI did some investigation and"
				+ " I was unable to locate your account on our systems under the email address provided."
				+ "\nDo you have an alternative email address which you may have used to sign up with the Daily mail?\n", "android"));
		
		messages.add(new Message ("Unable to play vidoes on kindle", "\nThank for emailing android"
				+ " support,\n\nWe are currently experience some issues with videos on Kindles where they are not playable Our developers are aware and are looking for a fix "
				+ "this issues.\n\nCurrently they trying to find out why this issues is occurring and will have an update soon.\n\n", "kindle"));
		
		
		messages.add(new Message("Voting arrows", "Thank you for your Email, \n\nI will look into your problem  and look for a method to remove red arrows/green arrows "
				+ " from comments if they are falsely  added by hackers.\n\nWe are always combating the hackers who come up with new methods to mess votes. "
				+ "  \n\nPlease be patience we are working very hard to get this resolved. \n", "android", "web"));
		
		messages.add(new Message("Comments not appearing on app", "Hello,\n\nThanks for your email. "
				+ "\n\nMailOnline has grown significantly over the last year and continues to grow in popularity. "
				+ " As a result we also have a higher number of comments submitted every day.  Where articles on comments are"
				+ " moderated we make every effort to review as many comments as possible.  Unfortunately there can sometimes be a delay between "
				+ "a comment being published and it appearing or because your comment does not agree to the house rules. \n \nFor more information regarding "
				+ "this please refer to our House Rules:\nhttp://www.dailymail.co.uk/home/article-1388145/House-Rules.html\n \nWe hope you continue to enjoy"
				+ " using the app and reading its contents.\n\nIf you continue to have problems please clear the app cache.\n\nKind regards,\n", "android"));
		
		messages.add(new Message("S5 ranage blocked", "Thank you for emailing Android support team.\n\nWe are currently facing some issues with the S5 range. \n\nOur"
				+ " developers are working to find a fix for this issue and should have an update soon.\n", "S5"));

	}

}