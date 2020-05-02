package com.interfacemockup.kalendar;

import android.net.Uri;


import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.DynamicLink.SocialMetaTagParameters.Builder;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;

public class DynamicLinksUtil {



    // [START ddl_generate_content_link]
    public static Uri generateContentLink() {

        //ovde najverovatnije ide link na web page ali sam za svaki slucaj stavio page.link
        Uri baseUrl = Uri.parse("https://pravoslavac.page.link/download");
        
        //ovde ide sigurno page.link
        String domain = "https://pravoslavac.page.link/download";




        DynamicLink link = FirebaseDynamicLinks.getInstance()
                .createDynamicLink()
                .setLink(baseUrl)
                .setDomainUriPrefix(domain)
                .setIosParameters(new DynamicLink.IosParameters.Builder("com.bilbija.Pravoslavac").build())
                .setAndroidParameters(new DynamicLink.AndroidParameters.Builder("com.interfacemockup.pravoslavac").build())
                .setSocialMetaTagParameters(
                        new DynamicLink.SocialMetaTagParameters.Builder()
                                .setTitle("Example of a Dynamic Link")
                                .setDescription("This link works whether the app is installed or not!")
                                .build())
                .buildDynamicLink();

        return link.getUri();
    }// [END ddl_generate_content_link]


} // end class


