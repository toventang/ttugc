package com.bytedance.android.livesdk.p542g;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.livesdk.g.f */
public class C8780f extends Fragment {

    /* renamed from: a */
    private static final String f21648a = C8780f.class.getCanonicalName();

    /* renamed from: b */
    private Context f21649b;

    /* renamed from: c */
    private View f21650c;

    /* renamed from: d */
    private Bundle f21651d;

    /* renamed from: e */
    private List<AbstractC8775a> f21652e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private int f21653f = 0;

    static {
        Covode.recordClassIndex(9657);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f21653f = 4;
        Iterator<AbstractC8775a> it = this.f21652e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f21653f = 3;
        Iterator<AbstractC8775a> it = this.f21652e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f21653f = 2;
        Iterator<AbstractC8775a> it = this.f21652e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f21653f = 5;
        Iterator<AbstractC8775a> it = this.f21652e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.f21653f != 6) {
            this.f21653f = 6;
            for (AbstractC8775a aVar : this.f21652e) {
                aVar.mo15047a();
            }
            this.f21652e.clear();
            super.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Iterator<AbstractC8775a> it = this.f21652e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21653f = 1;
        for (AbstractC8775a aVar : this.f21652e) {
            aVar.mo15048a(this.f21649b, this.f21650c);
        }
    }

    /* renamed from: a */
    private void m17082a(Context context, View view, Bundle bundle) {
        this.f21649b = context;
        this.f21650c = view;
        this.f21651d = bundle;
    }

    /* renamed from: a */
    public static C8780f m17080a(Fragment fragment, View view, Bundle bundle) {
        return m17081a(fragment.getChildFragmentManager(), fragment.getContext(), view, bundle);
    }

    /* renamed from: a */
    private static C8780f m17081a(AbstractC0952i iVar, Context context, View view, Bundle bundle) {
        C8780f fVar = new C8780f();
        fVar.m17082a(context, view, bundle);
        iVar.mo3552a().mo3456a(fVar, f21648a).mo3478e();
        return fVar;
    }
}
