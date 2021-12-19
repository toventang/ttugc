package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bf */
public abstract class AbstractC42751bf<T> {

    /* renamed from: a */
    private RecyclerView f99719a;

    /* renamed from: b */
    protected Context f99720b;

    /* renamed from: c */
    protected View f99721c;

    /* renamed from: d */
    public TextView f99722d;

    /* renamed from: e */
    protected TextView f99723e;

    /* renamed from: f */
    protected ViewGroup f99724f;

    /* renamed from: g */
    protected C67568r f99725g;

    /* renamed from: h */
    protected AbstractC42753a f99726h;

    /* renamed from: i */
    protected RecyclerView.AbstractC1350a f99727i;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bf$a */
    public interface AbstractC42753a {
        static {
            Covode.recordClassIndex(50857);
        }

        /* renamed from: a */
        void mo71588a();
    }

    static {
        Covode.recordClassIndex(50855);
    }

    /* renamed from: b */
    public final View mo73024b() {
        return this.f99721c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo73026c() {
        AbstractC42753a aVar = this.f99726h;
        if (aVar != null) {
            aVar.mo71588a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo73022a() {
        this.f99722d = (TextView) this.f99721c.findViewById(R.id.ds8);
        this.f99719a = (RecyclerView) this.f99721c.findViewById(R.id.ds5);
        this.f99723e = (TextView) this.f99721c.findViewById(R.id.dsa);
        ViewGroup viewGroup = (ViewGroup) this.f99721c.findViewById(R.id.ds_);
        this.f99724f = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42751bf.View$OnClickListenerC427521 */

            static {
                Covode.recordClassIndex(50856);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (AbstractC42751bf.this.f99726h != null) {
                    AbstractC42751bf.this.f99726h.mo71588a();
                }
            }
        });
        View findViewById = this.f99721c.findViewById(R.id.cks);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC42754bg(this));
        }
        C34729o.m70956a(false, this.f99721c.findViewById(R.id.brk));
        RecyclerView.AbstractC1350a aVar = this.f99727i;
        if (aVar != null) {
            this.f99719a.setAdapter(aVar);
        }
    }

    /* renamed from: a */
    public final void mo73023a(RecyclerView.AbstractC1350a aVar) {
        this.f99727i = aVar;
        this.f99719a.setAdapter(aVar);
    }

    protected AbstractC42751bf(View view, Context context, AbstractC42753a aVar) {
        this(view, context, aVar, (byte) 0);
    }

    /* renamed from: a */
    public void mo73020a(List<T> list, C67568r rVar, boolean z) {
        this.f99725g = rVar;
        if (z) {
            this.f99724f.setVisibility(0);
        } else {
            this.f99724f.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo73025b(List<T> list, C67568r rVar, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T t : list) {
            arrayList.add(new C42680ao(t, rVar, z));
        }
        ((AbstractC42638ad) this.f99727i).mo72835a(arrayList);
    }

    private AbstractC42751bf(View view, Context context, AbstractC42753a aVar, byte b) {
        this.f99721c = view;
        this.f99720b = context;
        this.f99726h = aVar;
        this.f99727i = null;
        mo73022a();
    }
}
