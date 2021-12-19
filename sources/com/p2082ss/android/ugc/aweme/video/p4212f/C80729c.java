package com.p2082ss.android.ugc.aweme.video.p4212f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.video.f.c */
public final class C80729c {

    /* renamed from: a */
    Context f180501a;

    /* renamed from: b */
    public ViewGroup f180502b;

    /* renamed from: c */
    public TableLayout f180503c;

    static {
        Covode.recordClassIndex(94016);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.f.c$a */
    public static class C80730a {

        /* renamed from: a */
        public TextView f180504a;

        /* renamed from: b */
        public TextView f180505b;

        static {
            Covode.recordClassIndex(94017);
        }

        private C80730a() {
        }

        /* synthetic */ C80730a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo123876a(String str) {
            TextView textView = this.f180505b;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public C80729c(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    static C80730a m139968a(View view) {
        C80730a aVar = (C80730a) view.getTag();
        if (aVar != null) {
            return aVar;
        }
        C80730a aVar2 = new C80730a((byte) 0);
        aVar2.f180504a = (TextView) view.findViewById(R.id.cpj);
        aVar2.f180505b = (TextView) view.findViewById(R.id.fb7);
        view.setTag(aVar2);
        return aVar2;
    }

    private C80729c(Context context, byte b) {
        MethodCollector.m26663i(1321);
        this.f180501a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.b2s, (ViewGroup) null);
        this.f180502b = viewGroup;
        this.f180503c = (TableLayout) viewGroup.findViewById(R.id.eef);
        MethodCollector.m26664o(1321);
    }
}
