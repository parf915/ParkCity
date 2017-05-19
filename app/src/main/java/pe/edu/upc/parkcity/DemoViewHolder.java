
        package pe.edu.upc.parkcity;

        import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.TextView;

/**
 * Created by SONU on 31/08/15.
 */
public abstract class DemoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener


{
    private ClickListener clicklistener = null;


    public TextView title;


    public DemoViewHolder(View view) {
        super(view);

        view.setOnClickListener(this);
        this.title = (TextView) view.findViewById(R.id.cardTitle);

    }
    @Override
    public void onClick(View v) {
        if (clicklistener != null) {
            clicklistener.itemClicked(v, getAdapterPosition());
        }
    }

}