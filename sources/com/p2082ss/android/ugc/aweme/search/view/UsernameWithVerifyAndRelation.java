package com.p2082ss.android.ugc.aweme.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.view.UsernameWithVerifyAndRelation */
public final class UsernameWithVerifyAndRelation extends ConstraintLayout {

    /* renamed from: g */
    private SparseArray f151958g;

    static {
        Covode.recordClassIndex(79459);
    }

    public UsernameWithVerifyAndRelation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: b */
    public final View mo9603b(int i) {
        if (this.f151958g == null) {
            this.f151958g = new SparseArray();
        }
        View view = (View) this.f151958g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f151958g.put(i, findViewById);
        return findViewById;
    }

    private /* synthetic */ UsernameWithVerifyAndRelation(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    private UsernameWithVerifyAndRelation(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, -1);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.awn, this, true);
    }

    /* renamed from: a */
    public final void mo106903a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        C89219l.m154721d(charSequence2, "");
        if (context != null && charSequence != null) {
            TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.f6v);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(charSequence);
            if (charSequence2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.f2b);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) mo9603b(R.id.f2b);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setText(charSequence2);
                return;
            }
            TuxTextView tuxTextView4 = (TuxTextView) mo9603b(R.id.f2b);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText("");
            TuxTextView tuxTextView5 = (TuxTextView) mo9603b(R.id.f2b);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
        }
    }
}
