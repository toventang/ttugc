package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView */
public final class NoticeButtonView extends LinearLayout implements View.OnClickListener, AbstractC17178d {

    /* renamed from: a */
    public static final C64329a f145800a = new C64329a((byte) 0);

    /* renamed from: b */
    private AbstractC64330b f145801b;

    /* renamed from: c */
    private int f145802c;

    /* renamed from: d */
    private final Context f145803d;

    /* renamed from: e */
    private final AttributeSet f145804e;

    /* renamed from: f */
    private final int f145805f;

    /* renamed from: g */
    private SparseArray f145806g;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView$b */
    public interface AbstractC64330b {
        static {
            Covode.recordClassIndex(75779);
        }

        /* renamed from: a */
        void mo103846a();

        /* renamed from: b */
        void mo103847b();

        /* renamed from: c */
        void mo103848c();
    }

    static {
        Covode.recordClassIndex(75777);
    }

    /* renamed from: b */
    private View m116191b(int i) {
        if (this.f145806g == null) {
            this.f145806g = new SparseArray();
        }
        View view = (View) this.f145806g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f145806g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public final void mo27128a(int i) {
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.NoticeButtonView$a */
    public static final class C64329a {
        static {
            Covode.recordClassIndex(75778);
        }

        private C64329a() {
        }

        public /* synthetic */ C64329a(byte b) {
            this();
        }
    }

    public final AttributeSet getAttrs() {
        return this.f145804e;
    }

    public final int getDefStyleAttr() {
        return this.f145805f;
    }

    public final AbstractC64330b getMClickListener() {
        return this.f145801b;
    }

    public final int getMColorMode() {
        return this.f145802c;
    }

    public final Context getMContext() {
        return this.f145803d;
    }

    public final TextView getContextTextView() {
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.bui);
        C89219l.m154716b(tuxTextView, "");
        return tuxTextView;
    }

    public final TextView getTitleTextView() {
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.c0h);
        C89219l.m154716b(tuxTextView, "");
        return tuxTextView;
    }

    public final void setMClickListener(AbstractC64330b bVar) {
        this.f145801b = bVar;
    }

    public final void setMColorMode(int i) {
        this.f145802c = i;
    }

    private final void setColorMode(int i) {
        if (this.f145802c != i) {
            this.f145802c = i;
        }
    }

    public final void setOnInternalClickListener(AbstractC64330b bVar) {
        C89219l.m154721d(bVar, "");
        this.f145801b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoticeButtonView(Context context) {
        this(context, null);
        C89219l.m154721d(context, "");
    }

    public final void setButtonBackgroundColor(int i) {
        ((DmtButton) m116191b(R.id.btg)).setBackgroundColor(i);
    }

    public final void setButtonTextColor(int i) {
        ((DmtButton) m116191b(R.id.btg)).setTextColor(i);
    }

    public final void setCloseImage(int i) {
        ((ImageView) m116191b(R.id.bu5)).setImageResource(i);
    }

    public final void setContextTextColor(int i) {
        ((TuxTextView) m116191b(R.id.bui)).setTextColor(i);
    }

    public final void setIconImage(int i) {
        ((ImageView) m116191b(R.id.bwm)).setImageResource(i);
    }

    public final void setNoticeBackgroundColor(int i) {
        ((LinearLayout) m116191b(R.id.ctv)).setBackgroundColor(i);
    }

    public final void setButtonBackgroundDrawable(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        DmtButton dmtButton = (DmtButton) m116191b(R.id.btg);
        C89219l.m154716b(dmtButton, "");
        dmtButton.setBackground(drawable);
    }

    public final void setCloseImage(Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        ((ImageView) m116191b(R.id.bu5)).setImageBitmap(bitmap);
    }

    public final void setContextText(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.bui);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void setIconImage(Bitmap bitmap) {
        C89219l.m154721d(bitmap, "");
        ((ImageView) m116191b(R.id.bwm)).setImageBitmap(bitmap);
    }

    public final void setItemText(String str) {
        C89219l.m154721d(str, "");
        DmtButton dmtButton = (DmtButton) m116191b(R.id.btg);
        C89219l.m154716b(dmtButton, "");
        dmtButton.setText(str);
    }

    public final void setTitleText(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.c0h);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void setContextText(int i) {
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.bui);
        C89219l.m154716b(tuxTextView, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        tuxTextView.setText(context.getResources().getText(i));
    }

    public final void setTitleText(int i) {
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.c0h);
        C89219l.m154716b(tuxTextView, "");
        Context context = getContext();
        C89219l.m154716b(context, "");
        tuxTextView.setText(context.getResources().getText(i));
    }

    public final void setContextText(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.bui);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void setTitleText(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.c0h);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public final void onClick(View view) {
        Integer num;
        AbstractC64330b bVar;
        ClickAgent.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        DmtButton dmtButton = (DmtButton) m116191b(R.id.btg);
        C89219l.m154716b(dmtButton, "");
        int id = dmtButton.getId();
        if (num != null && num.intValue() == id) {
            AbstractC64330b bVar2 = this.f145801b;
            if (bVar2 != null) {
                bVar2.mo103846a();
                return;
            }
            return;
        }
        ImageView imageView = (ImageView) m116191b(R.id.bu5);
        C89219l.m154716b(imageView, "");
        int id2 = imageView.getId();
        if (num != null && num.intValue() == id2) {
            AbstractC64330b bVar3 = this.f145801b;
            if (bVar3 != null) {
                bVar3.mo103847b();
                return;
            }
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.bui);
        C89219l.m154716b(tuxTextView, "");
        int id3 = tuxTextView.getId();
        if (num != null && num.intValue() == id3) {
            AbstractC64330b bVar4 = this.f145801b;
            if (bVar4 != null) {
                bVar4.mo103848c();
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) m116191b(R.id.c0h);
        C89219l.m154716b(tuxTextView2, "");
        int id4 = tuxTextView2.getId();
        if (num != null && num.intValue() == id4 && (bVar = this.f145801b) != null) {
            bVar.mo103848c();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NoticeButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeButtonView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7490);
        this.f145803d = context;
        this.f145804e = attributeSet;
        this.f145805f = 0;
        this.f145802c = -1;
        C89219l.m154721d(context, "");
        LinearLayout.inflate(context, R.layout.aoj, this);
        ((DmtButton) m116191b(R.id.btg)).setOnClickListener(this);
        ((ImageView) m116191b(R.id.bu5)).setOnClickListener(this);
        ((TuxTextView) m116191b(R.id.bui)).setOnClickListener(this);
        ((TuxTextView) m116191b(R.id.c0h)).setOnClickListener(this);
        ((DmtButton) m116191b(R.id.btg)).setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        ((ImageView) m116191b(R.id.bu5)).setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        C17175b bVar = C17175b.C17176a.f40922a;
        C89219l.m154716b(bVar, "");
        setColorMode(bVar.f40921a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.m1, R.attr.m2, R.attr.m3, R.attr.m4, R.attr.m5, R.attr.m6, R.attr.m7, R.attr.m8});
        C89219l.m154716b(obtainStyledAttributes, "");
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (drawable != null) {
            ((ImageView) m116191b(R.id.bwm)).setImageDrawable(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        if (drawable2 != null) {
            ((ImageView) m116191b(R.id.bu5)).setImageDrawable(drawable2);
        }
        TuxTextView tuxTextView = (TuxTextView) m116191b(R.id.c0h);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(obtainStyledAttributes.getString(6));
        ((TuxTextView) m116191b(R.id.c0h)).setTextColor(obtainStyledAttributes.getColor(7, C0643b.m2378c(getContext(), R.color.c0)));
        TuxTextView tuxTextView2 = (TuxTextView) m116191b(R.id.bui);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(obtainStyledAttributes.getString(1));
        ((TuxTextView) m116191b(R.id.bui)).setTextColor(obtainStyledAttributes.getColor(2, C0643b.m2378c(getContext(), R.color.c0)));
        DmtButton dmtButton = (DmtButton) m116191b(R.id.btg);
        C89219l.m154716b(dmtButton, "");
        dmtButton.setText(obtainStyledAttributes.getString(4));
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(7490);
    }
}
