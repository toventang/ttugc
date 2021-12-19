package com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar */
public final class CommonPopUpWebTitleBar extends FrameLayout {

    /* renamed from: b */
    public static final C38969a f92050b = new C38969a((byte) 0);

    /* renamed from: a */
    public String f92051a;

    /* renamed from: c */
    private AbstractC38970b f92052c;

    /* renamed from: d */
    private SparseArray f92053d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar$b */
    public interface AbstractC38970b {
        static {
            Covode.recordClassIndex(46561);
        }

        /* renamed from: a */
        void mo67678a();
    }

    static {
        Covode.recordClassIndex(46559);
    }

    public CommonPopUpWebTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo67680a(int i) {
        if (this.f92053d == null) {
            this.f92053d = new SparseArray();
        }
        View view = (View) this.f92053d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92053d.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar$a */
    public static final class C38969a {
        static {
            Covode.recordClassIndex(46560);
        }

        private C38969a() {
        }

        public /* synthetic */ C38969a(byte b) {
            this();
        }
    }

    public final String getDefTitle() {
        return this.f92051a;
    }

    public final AbstractC38970b getTitleBarListener() {
        return this.f92052c;
    }

    public final void setDefTitle(String str) {
        this.f92051a = str;
    }

    public final void setTitleBarListener(AbstractC38970b bVar) {
        this.f92052c = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebTitleBar$c */
    public static final class View$OnClickListenerC38971c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebTitleBar f92054a;

        static {
            Covode.recordClassIndex(46562);
        }

        public View$OnClickListenerC38971c(CommonPopUpWebTitleBar commonPopUpWebTitleBar) {
            this.f92054a = commonPopUpWebTitleBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC38970b titleBarListener = this.f92054a.getTitleBarListener();
            if (titleBarListener != null) {
                titleBarListener.mo67678a();
            }
        }
    }

    public final void setSubTitle(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo67680a(R.id.d4j);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    private /* synthetic */ CommonPopUpWebTitleBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonPopUpWebTitleBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5856);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bid, this, true);
        MethodCollector.m26664o(5856);
    }
}
