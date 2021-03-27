package lucas.oliveira.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter :RecyclerView.Adapter<ContactAdapter.ContactAdapterViewHolder> {//herda o recyclerview, necessita passar o tipo
    //o view holder é o próprio ConctactAdapter rodando a class ContactAdapter ViewHolder
    //criação da lista de contatos que o adaptar vai receber  para ser exibida em tela

    private val list: MutableList<Contact> = mutableListOf() //declara variável list do tipo Mutablelist
    //não existe a Contact ainda, a val list que vai armazenar lista


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate()//função para inflar o layout a ser criado
    }

    override fun onBindViewHolder(holder: ContactAdapterViewHolder, position: Int) {
        holder.bind(list.[position])// popular a view
    }

    override fun getItemCount(): Int {
        return list.size    //retorna tamanho da lista
    }
    class ContactAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //criação de uma inner class que herda o recycler viewholder//var itemview do tipo View
        // classe que vai implementar os componentes do reclycer
        fun bind(contact: Contact){

        }

    }


}
