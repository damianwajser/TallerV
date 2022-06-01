package com.example.tallerv.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tallerv.Entidades.CrearNotasE;
import com.example.tallerv.R;

import java.util.ArrayList;

public class ListaNotasAdapter extends RecyclerView.Adapter<ListaNotasAdapter.NotaViewHolder> {

    ArrayList<CrearNotasE> listadoNotas;

    public ListaNotasAdapter(ArrayList<CrearNotasE> listadoNotas){

        this.listadoNotas = listadoNotas;
    }

    @NonNull
    @Override

    //diseño de cada elemento de la lista
    public NotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_nota, null, false);
        return new NotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaNotasAdapter.NotaViewHolder holder, int position) {

        holder.viewTituloNota.setText(listadoNotas.get(position).getTituloNotaTxt());
        holder.viewLocalizacionNota.setText(listadoNotas.get(position).getLocalizacionNotaTxt());
        holder.viewDescripcionNota.setText(listadoNotas.get(position).getDescripcionNotaTxt());



    }

    @Override
    public int getItemCount() {
        return listadoNotas.size();

    }

    public class NotaViewHolder extends RecyclerView.ViewHolder {

        TextView viewTituloNota;
        TextView viewLocalizacionNota;
        TextView viewDescripcionNota;



        public NotaViewHolder(@NonNull View itemView) {
            super(itemView);

            viewTituloNota = itemView.findViewById(R.id.viewTituloNota);
            viewLocalizacionNota = itemView.findViewById(R.id.viewLocalizacionNota);
            viewDescripcionNota = itemView.findViewById(R.id.viewDescripcionNota);


            //ABRE LA VENTANA DE MODIFICAR


          /*  itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Context context = v.getContext();
                    Intent intent = new Intent(context, DetalleCliente.class);

                    intent.putExtra("ID",listadoClientes.get(getAdapterPosition()).getId());
                    context.startActivity(intent);
                }
            }); */

        }
    }
}