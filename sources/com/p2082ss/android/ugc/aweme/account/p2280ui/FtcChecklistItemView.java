package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.p032a.C0637f;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.p2280ui.ChecklistItemView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.ui.FtcChecklistItemView */
public final class FtcChecklistItemView extends ChecklistItemView {

    /* renamed from: b */
    private HashMap f78450b;

    static {
        Covode.recordClassIndex(39763);
    }

    public FtcChecklistItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.ChecklistItemView
    /* renamed from: a */
    public final View mo58735a(int i) {
        if (this.f78450b == null) {
            this.f78450b = new HashMap();
        }
        View view = (View) this.f78450b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78450b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.ChecklistItemView
    public final void setDesc(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo58735a(R.id.a4s);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2280ui.ChecklistItemView
    public final void setVariant(ChecklistItemView.EnumC32958b bVar) {
        C89219l.m154721d(bVar, "");
        int i = C32988b.f78518a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            ((ImageView) mo58735a(R.id.a4r)).setImageResource(R.drawable.j3);
            ((TuxTextView) mo58735a(R.id.a4s)).setTextColor(C0637f.m2349b(getResources(), R.color.c5, null));
        } else if (i == 3) {
            ((ImageView) mo58735a(R.id.a4r)).setImageResource(R.drawable.j4);
            ((TuxTextView) mo58735a(R.id.a4s)).setTextColor(C0637f.m2349b(getResources(), R.color.bx, null));
        }
    }

    private /* synthetic */ FtcChecklistItemView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FtcChecklistItemView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
