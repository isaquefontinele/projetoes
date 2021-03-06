package equipe.projetoes.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import equipe.projetoes.R;
import equipe.projetoes.models.Match;

/**
 * Created by Victor on 4/9/2016.
 */
public class MatchesRecyclerAdapter extends RecyclerView.Adapter<MatchesRecyclerAdapter.ViewHolder> {
    private List<Match> mDataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MatchesRecyclerAdapter(List<Match> myDataset) {
        mDataset = myDataset;


    }



    public void add(int position, Match item) {
        mDataset.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(Match item) {
        int position = mDataset.indexOf(item);
        mDataset.remove(position);
        notifyItemRemoved(position);
    }


    // Create new views (invoked by the layout manager)
    @Override
    public MatchesRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                       int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matches, parent, false);
        // set the view's size, margins, paddings and layout parameters
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

       // holder.txtNome.setText(mDataset.get(position).getNomeCursivo());
        //holder.img.setImageResource(mDataset.get(position).getResId());
        //Log.d("test",mDataset.get(position).getNomeCursivo()+ " image id "+mDataset.get(position).getResId());




    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    @Override
    public void onViewRecycled(ViewHolder holder) {
        if(holder.img != null)
        holder.img.setImageDrawable(null);
        super.onViewRecycled(holder);
    }

    @Override
    public void onViewAttachedToWindow(ViewHolder holder) {
        super.onViewAttachedToWindow(holder);

    }



    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private TextView txtNome;
        private TextView txtDesc;
        private ImageView img;

        public TextView getTxtNome() {
            return txtNome;
        }

        public TextView getTxtDesc() {
            return txtDesc;
        }

        public ImageView getImg() {
            return img;
        }

        public ViewHolder(View v) {
            super(v);

          /*  txtNome = (TextView) v.findViewById(R.id.txt_name);
            txtDesc = (TextView) v.findViewById(R.id.txt_desc);
            img = (ImageView) v.findViewById(R.id.img);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Intent it = new Intent(v.getContext(),);
                    //v.getContext().startActivity(it);
                    SelecaoDeSintomasActivity activity = (SelecaoDeSintomasActivity) view.getContext();
                    activity.openMenuSubMatch(mDataset.get(getAdapterPosition()));

                }
            });*/
        }
    }

}