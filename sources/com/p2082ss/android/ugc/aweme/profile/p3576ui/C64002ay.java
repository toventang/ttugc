package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ay */
public final class C64002ay extends BaseAdapter {

    /* renamed from: a */
    public SparseArray f145140a;

    /* renamed from: b */
    private Context f145141b;

    /* renamed from: c */
    private List<C64003a> f145142c;

    static {
        Covode.recordClassIndex(75446);
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        return this.f145142c.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.ay$a */
    public static class C64003a {

        /* renamed from: a */
        public String f145143a;

        /* renamed from: b */
        boolean f145144b = false;

        static {
            Covode.recordClassIndex(75447);
        }

        public C64003a(String str) {
            this.f145143a = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C64003a getItem(int i) {
        return this.f145142c.get(i);
    }

    public C64002ay(Context context, List<C64003a> list) {
        this.f145141b = context;
        this.f145142c = list;
        this.f145140a = new SparseArray(list.size());
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        MethodCollector.m26663i(8007);
        if (view == null) {
            view = View.inflate(this.f145141b, R.layout.amm, null);
        }
        C64003a a = getItem(i);
        this.f145140a.put(i, a.f145143a);
        View findViewById = view.findViewById(R.id.cmb);
        ((TextView) view.findViewById(R.id.ext)).setText(a.f145143a);
        if (a.f145144b) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        MethodCollector.m26664o(8007);
        return view;
    }
}
