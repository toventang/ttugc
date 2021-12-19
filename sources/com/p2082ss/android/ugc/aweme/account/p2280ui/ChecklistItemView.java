package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.ui.ChecklistItemView */
public class ChecklistItemView extends LinearLayout {

    /* renamed from: a */
    public static final C32957a f78416a = new C32957a((byte) 0);

    /* renamed from: b */
    private static final int f78417b = R.color.c5;

    /* renamed from: c */
    private static final int f78418c = R.color.bx;

    /* renamed from: d */
    private static final int f78419d = R.color.bg;

    /* renamed from: e */
    private static final int f78420e = R.color.bd;

    /* renamed from: f */
    private HashMap f78421f;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.ChecklistItemView$b */
    public enum EnumC32958b {
        Error,
        Success,
        None;

        static {
            Covode.recordClassIndex(39754);
        }
    }

    public ChecklistItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public View mo58735a(int i) {
        if (this.f78421f == null) {
            this.f78421f = new HashMap();
        }
        View view = (View) this.f78421f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78421f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.ChecklistItemView$a */
    public static final class C32957a {
        static {
            Covode.recordClassIndex(39753);
        }

        private C32957a() {
        }

        public /* synthetic */ C32957a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(39752);
    }

    public void setDesc(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo58735a(R.id.a4s);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public void setVariant(EnumC32958b bVar) {
        C89219l.m154721d(bVar, "");
        int i = C32987a.f78517a[bVar.ordinal()];
        if (i == 1) {
            ((ImageView) mo58735a(R.id.a4r)).setColorFilter(getResources().getColor(f78417b), PorterDuff.Mode.SRC_IN);
            ((TuxTextView) mo58735a(R.id.a4s)).setTextColor(getResources().getColor(f78420e));
            ImageView imageView = (ImageView) mo58735a(R.id.a4r);
            C89219l.m154716b(imageView, "");
            imageView.setAlpha(0.5f);
            TuxTextView tuxTextView = (TuxTextView) mo58735a(R.id.a4s);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setAlpha(0.5f);
        } else if (i == 2) {
            ((ImageView) mo58735a(R.id.a4r)).setColorFilter(getResources().getColor(f78419d), PorterDuff.Mode.SRC_IN);
            ((TuxTextView) mo58735a(R.id.a4s)).setTextColor(getResources().getColor(f78418c));
            ImageView imageView2 = (ImageView) mo58735a(R.id.a4r);
            C89219l.m154716b(imageView2, "");
            imageView2.setAlpha(1.0f);
            TuxTextView tuxTextView2 = (TuxTextView) mo58735a(R.id.a4s);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setAlpha(1.0f);
        } else if (i == 3) {
            Resources resources = getResources();
            int i2 = f78417b;
            ((ImageView) mo58735a(R.id.a4r)).setColorFilter(resources.getColor(i2), PorterDuff.Mode.SRC_IN);
            ((TuxTextView) mo58735a(R.id.a4s)).setTextColor(getResources().getColor(i2));
            ImageView imageView3 = (ImageView) mo58735a(R.id.a4r);
            C89219l.m154716b(imageView3, "");
            imageView3.setAlpha(0.5f);
            TuxTextView tuxTextView3 = (TuxTextView) mo58735a(R.id.a4s);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setAlpha(1.0f);
        }
    }

    private /* synthetic */ ChecklistItemView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChecklistItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10208);
        View.inflate(context, R.layout.fs, this);
        setVariant(EnumC32958b.None);
        MethodCollector.m26664o(10208);
    }
}
