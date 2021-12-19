package com.p2082ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.effect.p2888a.AbstractC46264a;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.effect.bm */
public final class C46327bm extends AbstractC46264a<C46329b> {

    /* renamed from: a */
    public AbstractC46328a f107984a;

    /* renamed from: b */
    public int f107985b = -1;

    /* renamed from: com.ss.android.ugc.aweme.effect.bm$a */
    public interface AbstractC46328a {
        static {
            Covode.recordClassIndex(54905);
        }

        /* renamed from: a */
        void mo78812a(EffectModel effectModel, int i, int i2);
    }

    static {
        Covode.recordClassIndex(54904);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89351a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (this.f107835c == null) {
            return 0;
        }
        return this.f107835c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.effect.bm$b */
    public class C46329b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        AVDmtImageTextView f107986a;

        /* renamed from: b */
        AVDmtImageView f107987b;

        /* renamed from: c */
        ObjectAnimator f107988c;

        /* renamed from: d */
        int f107989d = 1;

        static {
            Covode.recordClassIndex(54906);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo78813a() {
            ObjectAnimator objectAnimator = this.f107988c;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.f107988c.cancel();
            }
            this.f107987b.setRotation(0.0f);
            this.f107987b.setImageResource(2131230945);
        }

        C46329b(View view) {
            super(view);
            this.f107986a = (AVDmtImageTextView) view.findViewById(R.id.e91);
            this.f107987b = (AVDmtImageView) view.findViewById(R.id.bv8);
            this.f107986a.setOnClickListener(new View$OnClickListenerC46330bn(this));
            this.f107986a.setOnTouchListener(new View$OnTouchListenerC75885t(1.1f, 100, this.f107986a));
        }
    }

    /* renamed from: a */
    public final void mo78811a(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            int i = this.f107985b;
            if (i != -1) {
                this.f107985b = -1;
                notifyItemChanged(i);
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f107835c.size()) {
                break;
            } else if (this.f107835c.get(i2).key.equals(effectPointModel.getKey())) {
                this.f107985b = i2;
                break;
            } else {
                i2++;
            }
        }
        notifyItemChanged(this.f107985b);
    }

    public C46327bm(RecyclerView recyclerView, C46300a aVar) {
        super(recyclerView, aVar);
    }

    /* renamed from: a */
    private static Object m89352a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6287);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6287);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C46329b bVar = (C46329b) viewHolder;
        int a = mo78738a(i);
        EffectModel effectModel = C46327bm.this.f107835c.get(i);
        if (effectModel != null) {
            bVar.f107986a.mo121338a(effectModel.iconUrl);
            bVar.f107986a.setText(effectModel.name);
            AVDmtImageTextView aVDmtImageTextView = bVar.f107986a;
            if (i == C46327bm.this.f107985b) {
                z = true;
            } else {
                z = false;
            }
            aVDmtImageTextView.mo121340a(z);
            if (bVar.f107989d != a) {
                bVar.f107989d = a;
                if (a == 2) {
                    bVar.mo78813a();
                    bVar.f107987b.setVisibility(0);
                } else if (a == 4) {
                    bVar.f107987b.setVisibility(8);
                } else if (a == 8) {
                    bVar.f107987b.setVisibility(0);
                    bVar.f107987b.setImageResource(2131230947);
                    bVar.f107988c = ObjectAnimator.ofFloat(bVar.f107987b, "rotation", 0.0f, 360.0f);
                    bVar.f107988c.setDuration(800L);
                    bVar.f107988c.setRepeatMode(1);
                    bVar.f107988c.setRepeatCount(-1);
                    bVar.f107988c.setInterpolator(new LinearInterpolator());
                    bVar.f107988c.start();
                } else if (a == 16) {
                    bVar.mo78813a();
                    bVar.f107987b.setVisibility(8);
                } else if (a == 32) {
                    bVar.f107987b.setVisibility(0);
                    bVar.mo78813a();
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89351a(C46327bm bmVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6293);
        C46329b bVar = new C46329b(C1764a.m5927a((LayoutInflater) m89352a(viewGroup.getContext(), "layout_inflater"), R.layout.aav, viewGroup, false));
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(6293);
        return bVar;
    }
}
