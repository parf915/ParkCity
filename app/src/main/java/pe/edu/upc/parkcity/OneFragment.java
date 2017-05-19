package pe.edu.upc.parkcity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


import pe.edu.upc.parkcity.activities.ArticleActivity;
import pe.edu.upc.parkcity.activities.SearchResultsActivity;
import pe.edu.upc.parkcity.adapters.RecyclerView_Adapter;

public class OneFragment extends Fragment {

    private View view;

    private String title;//String for tab title

    private static RecyclerView recyclerView;


    public OneFragment() {
        // Required empty public constructor
    }

    public OneFragment(String title) {
        this.title=title;
        // Required empty public constructor
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_one,container,false);
        setRecyclerView();
        return view;
    }

    private void setRecyclerView() {

        recyclerView = (RecyclerView) view
                .findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView
                .setLayoutManager(new LinearLayoutManager(getActivity()));//Linear Items


        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(title+" Items " + i);//Adding items to recycler view
        }
        RecyclerView_Adapter adapter = new RecyclerView_Adapter(getActivity(), arrayList);
        recyclerView.setAdapter(adapter);// set adapter on recyclerview

    }



}
