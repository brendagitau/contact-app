package com.example.cardholderpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)




                displayContacts()
            }
            fun displayContacts(){
                var rvContacts= findViewById<RecyclerView>(R.id.rvContacts)
                var contactList= listOf(
                    Contacts("Kiki","0704424968","kiki@gmail.com") ,
                    Contacts("baba","0704795486","baba@gmail.com") ,Contacts("Kiki","0704424968","kiki@gmail.com") ,
                    Contacts("dada","0704678994","dada@gmail.com") ,
                    Contacts("Kellie","07234567887","kellie@gmail.com") ,
                    Contacts("Dante","0709876548","Dante@gmail.com") ,
                    Contacts("Jonte","0703456789","Jonte@gmail.com") ,
                    Contacts("Yobra","07087654375","Yobra@gmail.com") ,
                    Contacts("Zara","07034567856","Zara@gmail.com") ,
                    Contacts("Josh","07049876543","Joshua@gmail.com") ,
                    Contacts("Anita","07034568753","anita@gmail.com") ,
                    Contacts("Zedi","0704234567567","zedi@gmail.com") ,
                    Contacts("Yeshua","07023456745","Yeshua@gmail.com") ,
                    Contacts("Reti","07023456787","reti@gmail.com") ,
                    Contacts("Dawn","070423456787","dawn@gmail.com")



                    )
                var contactAdapter=ContactsAdapter(contactList)
                rvContacts.layoutManager= LinearLayoutManager(baseContext)
                rvContacts.adapter=contactAdapter
            }

        }


