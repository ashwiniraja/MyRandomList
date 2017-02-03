package layout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import android.view.LayoutInflater;
import com.example.nandash.sampleapp.R;

/**
 * Created by Nandash on 03-02-2017.
 */
public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<NewPost> mDataSet;
    public PostAdapter(Context newContext,ArrayList<NewPost> posts)
    {
        context=newContext;
        mDataSet=posts;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textview1;
        public TextView textview2;
        public ViewHolder(View itemView){
            super(itemView);
            textview1 = (TextView) itemView.findViewById(R.id.user_name);
            textview2 = (TextView) itemView.findViewById(R.id.postDescription);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).textview1.setText(mDataSet.get(position).name);
        ((ViewHolder) holder).textview2.setText(mDataSet.get(position).post);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.layout_post, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return  viewHolder;
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
