package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.cover.AbstractC69978a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.o */
public final class C74295o extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public C89378p<Integer, Bitmap>[] f167063a;

    /* renamed from: b */
    public boolean f167064b;

    /* renamed from: c */
    public int f167065c;

    /* renamed from: d */
    public int f167066d;

    /* renamed from: e */
    private C74297p f167067e;

    /* renamed from: f */
    private AbstractC88412b f167068f;

    /* renamed from: g */
    private int f167069g;

    /* renamed from: h */
    private int f167070h;

    /* renamed from: i */
    private int f167071i;

    static {
        Covode.recordClassIndex(87067);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m130702a(this, viewGroup, i);
    }

    /* renamed from: a */
    public final void mo116904a() {
        this.f167068f.dispose();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f167067e.f167074a / this.f167071i;
    }

    /* renamed from: b */
    private final int m130703b(int i) {
        return i + (this.f167066d * this.f167065c);
    }

    /* renamed from: a */
    public final int mo116903a(int i) {
        int i2 = this.f167065c;
        if (i / i2 != this.f167066d) {
            return -1;
        }
        return i % i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        View view = viewHolder.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        int b = m130703b(i);
        C89378p<Integer, Bitmap>[] pVarArr = this.f167063a;
        Bitmap bitmap = null;
        if (b > pVarArr.length) {
            imageView.setImageBitmap(null);
        } else if (pVarArr[m130703b(i)] == null) {
            C89378p<Integer, Bitmap> pVar = this.f167063a[0];
            if (pVar != null) {
                bitmap = pVar.getSecond();
            }
            imageView.setImageBitmap(bitmap);
        } else {
            C89378p<Integer, Bitmap> pVar2 = this.f167063a[m130703b(i)];
            if (pVar2 != null) {
                bitmap = pVar2.getSecond();
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    public C74295o(AbstractC69978a aVar, int i, int i2) {
        C89219l.m154721d(aVar, "");
        this.f167069g = i;
        this.f167070h = i2;
        this.f167071i = 1;
        C74297p pVar = new C74297p(aVar, this.f167069g, this.f167070h, aVar.mo110421a());
        this.f167067e = pVar;
        this.f167063a = new C89378p[pVar.f167074a];
        this.f167064b = true;
        this.f167065c = 7;
        AbstractC88412b d = this.f167067e.mo116905a().mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.C74295o.C742961 */

            /* renamed from: a */
            final /* synthetic */ C74295o f167072a;

            static {
                Covode.recordClassIndex(87068);
            }

            {
                this.f167072a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C89378p<Integer, Bitmap> pVar = (C89378p) obj;
                this.f167072a.f167063a[pVar.getFirst().intValue()] = pVar;
                if (this.f167072a.f167064b) {
                    this.f167072a.f167064b = false;
                    this.f167072a.notifyDataSetChanged();
                } else if (this.f167072a.mo116903a(pVar.getFirst().intValue()) >= 0) {
                    C74295o oVar = this.f167072a;
                    oVar.notifyItemChanged(oVar.mo116903a(pVar.getFirst().intValue()));
                }
            }
        });
        C89219l.m154716b(d, "");
        this.f167068f = d;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m130702a(C74295o oVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9679);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2x, viewGroup, false);
        if (a2 != null) {
            ImageView imageView = (ImageView) a2;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = oVar.f167070h;
            layoutParams.width = oVar.f167069g;
            imageView.setLayoutParams(layoutParams);
            C74303r rVar = new C74303r(imageView);
            try {
                if (rVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(rVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) rVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(rVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = rVar.getClass().getName();
            MethodCollector.m26664o(9679);
            return rVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        MethodCollector.m26664o(9679);
        throw nullPointerException;
    }

    public /* synthetic */ C74295o(AbstractC69978a aVar, int i, int i2, byte b) {
        this(aVar, i, i2);
    }
}
