package com.p2082ss.android.ugc.tools.view.p4366e;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.e.a */
public final class C84954a {

    /* renamed from: a */
    public RelativeLayout f189824a;

    /* renamed from: b */
    public DialogInterface.OnClickListener f189825b;

    /* renamed from: c */
    public DialogInterface.OnClickListener f189826c;

    /* renamed from: d */
    private Context f189827d;

    /* renamed from: e */
    private TextView f189828e;

    /* renamed from: f */
    private TextView f189829f;

    /* renamed from: g */
    private TextView f189830g;

    /* renamed from: h */
    private TextView f189831h;

    /* renamed from: i */
    private TextView f189832i;

    /* renamed from: j */
    private ImageView f189833j;

    /* renamed from: k */
    private View f189834k;

    /* renamed from: l */
    private View f189835l;

    /* renamed from: m */
    private RelativeLayout f189836m;

    /* renamed from: n */
    private String f189837n;

    /* renamed from: o */
    private String f189838o;

    /* renamed from: p */
    private String f189839p;

    /* renamed from: q */
    private String f189840q;

    /* renamed from: r */
    private int f189841r;

    static {
        Covode.recordClassIndex(98949);
    }

    /* renamed from: com.ss.android.ugc.tools.view.e.a$a */
    public static class C84957a {

        /* renamed from: a */
        public String f189844a;

        /* renamed from: b */
        public String f189845b;

        /* renamed from: c */
        public String f189846c;

        /* renamed from: d */
        public String f189847d;

        /* renamed from: e */
        public int f189848e;

        /* renamed from: f */
        public DialogInterface.OnClickListener f189849f;

        /* renamed from: g */
        public DialogInterface.OnClickListener f189850g;

        /* renamed from: h */
        public Context f189851h;

        /* renamed from: i */
        public View f189852i;

        static {
            Covode.recordClassIndex(98952);
        }

        /* renamed from: a */
        public final C84954a mo129719a() {
            return new C84954a(this, (byte) 0);
        }

        public C84957a(Context context) {
            this.f189851h = context;
        }

        /* renamed from: a */
        public final C84957a mo129716a(int i) {
            this.f189844a = this.f189851h.getString(i);
            return this;
        }

        /* renamed from: a */
        public final C84957a mo129718a(DialogInterface.OnClickListener onClickListener) {
            this.f189847d = this.f189851h.getString(R.string.a8y);
            this.f189850g = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C84957a mo129717a(int i, DialogInterface.OnClickListener onClickListener) {
            this.f189846c = this.f189851h.getString(i);
            this.f189849f = onClickListener;
            return this;
        }
    }

    /* renamed from: a */
    public final Dialog mo129713a() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f189827d);
        if (!TextUtils.isEmpty(this.f189837n)) {
            builder.setTitle(this.f189837n);
        }
        if (!TextUtils.isEmpty(this.f189838o)) {
            builder.setMessage(this.f189838o);
        }
        builder.setPositiveButton(this.f189839p, new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.tools.view.p4366e.C84954a.DialogInterface$OnClickListenerC849551 */

            static {
                Covode.recordClassIndex(98950);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C84954a.m146015a(dialogInterface);
                if (C84954a.this.f189825b != null) {
                    C84954a.this.f189825b.onClick(dialogInterface, i);
                }
            }
        });
        if (!TextUtils.isEmpty(this.f189840q)) {
            builder.setNegativeButton(this.f189840q, new DialogInterface.OnClickListener() {
                /* class com.p2082ss.android.ugc.tools.view.p4366e.C84954a.DialogInterface$OnClickListenerC849562 */

                static {
                    Covode.recordClassIndex(98951);
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C84954a.m146015a(dialogInterface);
                    if (C84954a.this.f189826c != null) {
                        C84954a.this.f189826c.onClick(dialogInterface, i);
                    }
                }
            });
        }
        AlertDialog create = builder.create();
        try {
            create.show();
        } catch (Exception unused) {
        }
        return create;
    }

    /* renamed from: a */
    public static void m146015a(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
    }

    private C84954a(C84957a aVar) {
        MethodCollector.m26663i(901);
        this.f189827d = aVar.f189851h;
        this.f189841r = aVar.f189848e;
        this.f189837n = aVar.f189844a;
        this.f189838o = aVar.f189845b;
        this.f189840q = aVar.f189847d;
        this.f189839p = aVar.f189846c;
        this.f189825b = aVar.f189849f;
        this.f189826c = aVar.f189850g;
        this.f189835l = aVar.f189852i;
        View inflate = LayoutInflater.from(this.f189827d).inflate(R.layout.b3g, (ViewGroup) null);
        this.f189834k = inflate;
        this.f189828e = (TextView) inflate.findViewById(R.id.f63);
        this.f189829f = (TextView) this.f189834k.findViewById(R.id.eu6);
        this.f189833j = (ImageView) this.f189834k.findViewById(R.id.bgp);
        this.f189830g = (TextView) this.f189834k.findViewById(R.id.eya);
        this.f189831h = (TextView) this.f189834k.findViewById(R.id.f2r);
        this.f189832i = (TextView) this.f189834k.findViewById(R.id.eyj);
        this.f189824a = (RelativeLayout) this.f189834k.findViewById(R.id.dno);
        this.f189836m = (RelativeLayout) this.f189834k.findViewById(R.id.dla);
        MethodCollector.m26664o(901);
    }

    /* synthetic */ C84954a(C84957a aVar, byte b) {
        this(aVar);
    }
}
