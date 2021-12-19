package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatButton;
import com.bytedance.covode.number.Covode;
import com.google.android.material.p1952b.C26582a;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    static {
        Covode.recordClassIndex(32192);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new C26582a(context, attributeSet);
    }
}
