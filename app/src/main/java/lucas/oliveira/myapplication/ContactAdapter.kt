package lucas.oliveira.myapplication

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter :RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder> {//herda o recyclerview, necessita passar o tipo
    //o view holder é o próprio ConctactAdapter rodando a class ContactAdapter ViewHolder
    //criação da lista de contatos que o adaptar vai receber  para ser exibida em tela

    private val list: MutableList<Contact> = mutableListOf() //declara variável list do tipo Mutablelist
    //não existe a Contact ainda, a val list que vai armazenar lista


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    class ContactAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //criação de uma inner class que herda o recycler viewholder//var itemview do tipo View
        // classe que vai implementar os componentes do reclycer

    }


}
