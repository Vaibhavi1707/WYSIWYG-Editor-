package com.example.firsttype;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.dankito.richtexteditor.android.RichTextEditor;
import net.dankito.richtexteditor.android.toolbar.AllCommandsEditorToolbar;

public class MainActivity extends AppCompatActivity {
    private RichTextEditor editor;

    private AllCommandsEditorToolbar editorToolbar;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editor = (RichTextEditor) findViewById(R.id.editor);

        editorToolbar = (AllCommandsEditorToolbar) findViewById(R.id.editorToolbar);
        editorToolbar.setEditor(editor);

        editor.setEditorFontSize(20);
        editor.setPadding((int) (4 * getResources().getDisplayMetrics().density));

        // some properties you also can set on editor
//         editor.setEditorBackgroundColor(Color.YELLOW);
        // editor.setEditorFontColor(Color.MAGENTA);
        // editor.setEditorFontFamily("cursive");

        // show keyboard right at start up
        editor.focusEditorAndShowKeyboardDelayed();
    }


    @Override
    public void onBackPressed() {
        if(editorToolbar.handlesBackButtonPress() == false) {
            super.onBackPressed();
        }
    }

}