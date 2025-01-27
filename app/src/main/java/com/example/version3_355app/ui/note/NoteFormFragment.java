package com.example.version3_355app.ui.note;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.version3_355app.R;
import com.example.version3_355app.databinding.FragmentCalendarBinding;
import com.example.version3_355app.databinding.FragmentNoteFormBinding;
import com.example.version3_355app.ui.calendar.CalendarFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoteFormFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoteFormFragment extends Fragment {

 
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
   // private FragmentNoteFormBinding binding;



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NoteFormFragment() {
        // Required empty public constructor
    }

    
    // TODO: Rename and change types and number of parameters
    public static NoteFormFragment newInstance(String param1, String param2) {
        NoteFormFragment fragment = new NoteFormFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_form, container, false);
    }

}