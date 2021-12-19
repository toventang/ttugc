package com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38225ak;
import com.p2082ss.android.ugc.aweme.commercialize.views.bottomdialog.C38852d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b */
public final class C38838b extends RecyclerView.AbstractC1350a<C38852d> {

    /* renamed from: e */
    public static final C38840b f91714e = new C38840b((byte) 0);

    /* renamed from: a */
    public int f91715a = -1;

    /* renamed from: b */
    public AbstractC38839a f91716b;

    /* renamed from: c */
    public final List<C38225ak> f91717c;

    /* renamed from: d */
    public final boolean f91718d;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$a */
    public interface AbstractC38839a {
        static {
            Covode.recordClassIndex(46393);
        }

        /* renamed from: a */
        void mo67452a(int i);
    }

    static {
        Covode.recordClassIndex(46392);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C38852d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m78784a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.b$b */
    public static final class C38840b {
        static {
            Covode.recordClassIndex(46394);
        }

        private C38840b() {
        }

        public /* synthetic */ C38840b(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f91717c.size();
    }

    /* renamed from: a */
    public final void mo67451a(int i) {
        int i2 = this.f91715a;
        if (i2 != i) {
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            this.f91715a = i;
            notifyItemChanged(i);
            AbstractC38839a aVar = this.f91716b;
            if (aVar != null) {
                aVar.mo67452a(i);
                return;
            }
            return;
        }
        this.f91715a = -1;
        notifyItemChanged(i);
        AbstractC38839a aVar2 = this.f91716b;
        if (aVar2 != null) {
            aVar2.mo67452a(-1);
        }
    }

    public C38838b(List<C38225ak> list, boolean z) {
        C89219l.m154721d(list, "");
        this.f91717c = list;
        this.f91718d = z;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m78784a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4631);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aaa, viewGroup, false);
        C89219l.m154716b(a2, "");
        C38852d dVar = new C38852d(a2);
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = dVar.getClass().getName();
        MethodCollector.m26664o(4631);
        return dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C38852d dVar, int i) {
        boolean z;
        String str;
        C38852d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        boolean z2 = this.f91718d;
        C89219l.m154721d(this, "");
        C38225ak akVar = this.f91717c.get(i);
        int i2 = 0;
        if (i == this.f91715a) {
            z = true;
        } else {
            z = false;
        }
        if (z2) {
            FrameLayout a = dVar2.mo67457a();
            if (a != null) {
                a.setVisibility(0);
                TextView textView = (TextView) a.findViewById(R.id.e1g);
                if (textView != null) {
                    textView.setText(akVar.f90309a);
                }
                ImageView imageView = (ImageView) a.findViewById(R.id.e1e);
                if (imageView != null) {
                    if (!z) {
                        i2 = 4;
                    }
                    imageView.setVisibility(i2);
                }
            }
            LinearLayout b = dVar2.mo67458b();
            if (b != null) {
                b.setVisibility(8);
            }
        } else {
            FrameLayout a2 = dVar2.mo67457a();
            if (a2 != null) {
                a2.setVisibility(8);
            }
            LinearLayout b2 = dVar2.mo67458b();
            if (b2 != null) {
                b2.setVisibility(0);
                TextView textView2 = (TextView) b2.findViewById(R.id.cmz);
                if (textView2 != null) {
                    textView2.setText(akVar.f90309a);
                    if (z) {
                        str = "#fe2c55";
                    } else {
                        str = "#e6161823";
                    }
                    textView2.setTextColor(Color.parseColor(str));
                }
            }
        }
        dVar2.itemView.setOnClickListener(new C38852d.View$OnClickListenerC38854b(this, i));
    }
}
