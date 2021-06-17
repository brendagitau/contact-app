package com.example.cardholderpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter (var contactList:List<Contacts>/*we are reffering to the dataclass we created*/):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        //creates a 2nd instance or space of the view holder
        //create a view holder
        //give life to the views ie layout we made
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contacts_list_item,parent,false)
        return ContactViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {//courseholder is made of diff views
        //takes values from a  position in our list and place on the view holder
        //take item from list from certain position and pushing it up the slot we created.
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.contactName//filling our views with the data
        holder.tvPhoneNumber.text=currentContact.contactPhone
        holder.tvEmail.text=currentContact.contactEmail
        //every time we see a recycler view it will have all this attributes
    }

    override fun getItemCount(): Int {
        //SIZE OF OUR LIST ile list is in the adapter class
        return contactList.size
    }
}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    //GET INDIVIDUAL VIEWS
    //items to be displayed
    //empty form
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)

}