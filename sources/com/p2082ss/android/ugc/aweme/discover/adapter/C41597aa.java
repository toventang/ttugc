package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41910a;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractView$OnClickListenerC42302e;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.discover.widget.DialogC43041d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa */
public final class C41597aa extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public AbstractC42664al.AbstractC42666b f97020a;

    /* renamed from: b */
    public C41910a.EnumC41912b f97021b;

    /* renamed from: c */
    TextView f97022c;

    /* renamed from: d */
    TextView f97023d;

    static {
        Covode.recordClassIndex(49510);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.aa$2 */
    public static /* synthetic */ class C415992 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97025a;

        static {
            Covode.recordClassIndex(49512);
            int[] iArr = new int[C41910a.EnumC41912b.values().length];
            f97025a = iArr;
            try {
                iArr[C41910a.EnumC41912b.TYPE_CLEAR_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public C41597aa(View view, AbstractC42664al.AbstractC42666b bVar) {
        super(view);
        this.f97022c = (TextView) view.findViewById(R.id.a6a);
        this.f97023d = (TextView) view.findViewById(R.id.df9);
        this.f97020a = bVar;
        this.f97022c.setOnClickListener(new AbstractView$OnClickListenerC42302e() {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41597aa.C415981 */

            static {
                Covode.recordClassIndex(49511);
            }

            @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractView$OnClickListenerC42302e
            /* renamed from: a */
            public final void mo70821a() {
                if (C41597aa.this.f97020a != null) {
                    DialogC43041d b = new DialogC43041d(C41597aa.this.itemView.getContext()).mo73238c(C41597aa.this.itemView.getContext().getString(R.string.ffx)).mo73239d(C41597aa.this.itemView.getContext().getString(R.string.ffy)).mo73236a(C41597aa.this.itemView.getContext().getString(R.string.ffv)).mo73237b(C41597aa.this.itemView.getContext().getString(R.string.ffw));
                    b.show();
                    TextView textView = b.f100340a;
                    TextView textView2 = b.f100341b;
                    if (textView != null) {
                        textView.setOnClickListener(new View$OnClickListenerC41600ab(b));
                    }
                    if (textView2 != null) {
                        textView2.setOnClickListener(new View$OnClickListenerC41601ac(this, b));
                    }
                }
            }
        });
        Typeface a = C17300a.m32029a().mo27610a(C17303d.f41568b);
        if (a != null) {
            this.f97023d.setTypeface(a);
        }
    }
}
