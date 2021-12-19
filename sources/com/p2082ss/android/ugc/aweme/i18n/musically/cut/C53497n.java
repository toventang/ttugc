package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.mediachoose.AbstractC59180g;
import com.p2082ss.android.ugc.aweme.mediachoose.C59164c;
import com.p2082ss.android.ugc.aweme.mediachoose.C59179f;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72053aa;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.n */
public final class C53497n extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    boolean f122794a;

    /* renamed from: b */
    final List<MediaModel> f122795b = new ArrayList();

    /* renamed from: c */
    public List<Integer> f122796c;

    /* renamed from: d */
    public List<Integer> f122797d;

    /* renamed from: e */
    public boolean f122798e;

    /* renamed from: f */
    public AbstractC53499a f122799f;

    /* renamed from: g */
    public int f122800g = -1;

    /* renamed from: h */
    public int f122801h = -1;

    /* renamed from: i */
    public boolean f122802i;

    /* renamed from: j */
    List<MediaModel> f122803j;

    /* renamed from: k */
    C53506t f122804k;

    /* renamed from: l */
    AbstractC59180g f122805l;

    /* renamed from: m */
    private final Context f122806m;

    /* renamed from: n */
    private int f122807n = 0;

    /* renamed from: o */
    private int f122808o;

    /* renamed from: p */
    private double f122809p;

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.n$a */
    public interface AbstractC53499a {
        static {
            Covode.recordClassIndex(63072);
        }

        /* renamed from: a */
        void mo90086a(MediaModel mediaModel);
    }

    static {
        Covode.recordClassIndex(63070);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m98713a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f122795b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.n$b */
    public static class C53500b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        SimpleDraweeView f122813a;

        /* renamed from: b */
        TextView f122814b;

        /* renamed from: c */
        TextView f122815c;

        /* renamed from: d */
        View f122816d;

        /* renamed from: e */
        FrameLayout f122817e;

        /* renamed from: f */
        View f122818f;

        static {
            Covode.recordClassIndex(63073);
        }

        /* renamed from: a */
        public final void mo90087a() {
            this.f122815c.setText("");
            this.f122815c.setBackgroundResource(R.drawable.ry);
        }

        C53500b(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo90088a(int i) {
            this.f122815c.setText(String.valueOf(i + 1));
            this.f122815c.setBackgroundResource(R.drawable.rz);
        }
    }

    /* renamed from: a */
    private void m98715a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f122807n) {
            int i = layoutParams.height;
            int i2 = this.f122807n;
            double d = (double) i2;
            double d2 = this.f122809p;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = i2;
                double d3 = (double) this.f122807n;
                double d4 = this.f122809p;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo90084a(int i) {
        List<Integer> list = this.f122797d;
        if (list == null) {
            this.f122797d = new ArrayList();
        } else {
            list.clear();
        }
        List<Integer> list2 = this.f122796c;
        if (list2 == null) {
            this.f122796c = new ArrayList();
        } else {
            list2.clear();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f122796c.add(-1);
        }
    }

    /* renamed from: a */
    static /* synthetic */ C89391z m98714a(Context context, C59179f fVar) {
        m98716a(fVar.f134656b, 1, fVar.f134657c, "select");
        C40982q.m82520a("aweme_movie_import_error_rate", 1, new C69840ar().mo110189a("errorCode", String.valueOf(fVar.f134659e)).mo110189a("errorMsg", fVar.f134660f).mo110191a());
        C72053aa.m127203a(context, fVar.f134659e, -1);
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        int i2;
        String a;
        float f;
        C53500b bVar = (C53500b) viewHolder;
        m98715a(bVar.f122813a);
        m98715a(bVar.f122816d);
        m98715a(bVar.f122818f);
        final MediaModel mediaModel = this.f122795b.get(i);
        FrameLayout frameLayout = bVar.f122817e;
        if (this.f122798e) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        if (this.f122800g != -1) {
            bVar.f122814b.setTextColor(this.f122800g);
        }
        if (this.f122801h != -1) {
            bVar.f122814b.setShadowLayer(6.0f, 0.0f, 3.0f, this.f122801h);
        }
        if (!this.f122802i) {
            bVar.f122814b.setBackgroundResource(0);
        } else {
            C24250e eVar = new C24250e();
            eVar.mo39978a(C13628n.m24520b(this.f122806m, 2.0f));
            C24246a a2 = new C24247b(this.f122806m.getResources()).mo39973a();
            a2.mo39959a(eVar);
            bVar.f122813a.setHierarchy(a2);
            bVar.f122814b.setBackgroundResource(R.drawable.awr);
            Drawable drawable = this.f122806m.getResources().getDrawable(2131235029);
            bVar.f122814b.setCompoundDrawablePadding((int) C13628n.m24520b(this.f122806m, 2.0f));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            bVar.f122814b.setCompoundDrawables(drawable, null, null, null);
        }
        float f2 = 1.0f;
        int round = Math.round((((float) mediaModel.f134668h) * 1.0f) / 1000.0f);
        bVar.f122816d.setVisibility(4);
        TextView textView = bVar.f122814b;
        int i3 = round % 60;
        int i4 = round / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            a = C1764a.m5929a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        } else {
            a = C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        textView.setText(a);
        int intValue = this.f122796c.get(i).intValue();
        if (intValue >= 0) {
            bVar.mo90088a(intValue);
            bVar.f122818f.setVisibility(0);
            f = 1.1f;
        } else {
            bVar.mo90087a();
            bVar.f122818f.setVisibility(4);
            if (this.f122797d.size() >= 12) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            f = 1.0f;
        }
        if (bVar.f122813a.getAlpha() != f2) {
            bVar.f122813a.setAlpha(f2);
        }
        if (bVar.f122813a.getScaleX() != f) {
            bVar.f122813a.setScaleX(f);
            bVar.f122813a.setScaleY(f);
        }
        C24639c a3 = C24639c.m47149a(C84896h.m145871d(mediaModel.f134662b));
        int i7 = this.f122807n;
        a3.f58553d = new C24363d(i7, i7);
        C24185e b = C24182c.m45843b();
        b.f57309m = bVar.f122813a.getController();
        b.f57299c = (REQUEST) a3.mo40483a();
        bVar.f122813a.setController(b.mo39827e());
        bVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53497n.View$OnClickListenerC534981 */

            static {
                Covode.recordClassIndex(63071);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (i < C53497n.this.f122796c.size()) {
                    if (C53497n.this.f122796c.get(i).intValue() >= 0 || C53497n.this.f122797d.size() < 12) {
                        C53497n.this.f122799f.mo90086a(mediaModel);
                    }
                }
            }
        });
        bVar.f122817e.setOnClickListener(new View$OnClickListenerC53501o(this, bVar, i, mediaModel));
    }

    public C53497n(Context context, C53506t tVar, int i) {
        this.f122806m = context;
        this.f122804k = tVar;
        this.f122808o = i;
        this.f122809p = 1.0d;
        context.getResources().getDimensionPixelOffset(R.dimen.oj);
        int b = (int) C13628n.m24520b(context, 1.5f);
        int a = C13628n.m24504a(context);
        int i2 = this.f122808o;
        this.f122807n = ((a - ((i2 - 1) * b)) - 0) / i2;
        C59164c cVar = new C59164c(context);
        this.f122805l = cVar;
        cVar.mo96648a();
        this.f122805l.mo96650a("enter_from_multi");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m98713a(C53497n nVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7984);
        View inflate = LayoutInflater.from(nVar.f122806m).inflate(R.layout.ajy, (ViewGroup) null);
        C53500b bVar = new C53500b(inflate);
        bVar.f122813a = (SimpleDraweeView) inflate.findViewById(R.id.cj3);
        bVar.f122814b = (TextView) inflate.findViewById(R.id.fcf);
        bVar.f122815c = (TextView) inflate.findViewById(R.id.bla);
        bVar.f122816d = inflate.findViewById(R.id.f9n);
        bVar.f122816d.setVisibility(8);
        bVar.f122818f = inflate.findViewById(R.id.du8);
        bVar.f122817e = (FrameLayout) inflate.findViewById(R.id.b4o);
        ViewGroup.LayoutParams layoutParams = bVar.f122817e.getLayoutParams();
        layoutParams.height = (int) C13628n.m24520b(bVar.f122817e.getContext(), 48.0f);
        layoutParams.width = (int) C13628n.m24520b(bVar.f122817e.getContext(), 48.0f);
        bVar.f122817e.setLayoutParams(layoutParams);
        inflate.setTag(bVar);
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
        MethodCollector.m26664o(7984);
        return bVar;
    }

    /* renamed from: a */
    private static void m98716a(String str, int i, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C40982q.m82523a("aweme_video_import_duration", jSONObject, new C69840ar().mo110189a("status", String.valueOf(i)).mo110189a("scene_name", str2).mo110189a(StringSet.type, str).mo110191a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo90083a(C53500b bVar, int i, MediaModel mediaModel, C59179f fVar) {
        m98716a(fVar.f134656b, 0, fVar.f134657c, "select");
        if (this.f122797d.size() >= 12) {
            new C23144b(bVar.itemView).mo37635a(this.f122806m.getString(R.string.ad2)).mo37637b();
            return null;
        }
        if (this.f122803j == null) {
            this.f122803j = new ArrayList();
        }
        this.f122803j.add(mediaModel);
        this.f122797d.add(Integer.valueOf(i));
        Arrays.toString(this.f122797d.toArray());
        bVar.mo90088a(this.f122797d.size() - 1);
        this.f122796c.set(i, Integer.valueOf(this.f122797d.size() - 1));
        this.f122794a = true;
        bVar.f122813a.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new RunnableC53505s(this)).start();
        bVar.f122818f.setAlpha(0.0f);
        bVar.f122818f.setVisibility(0);
        bVar.f122818f.animate().alpha(1.0f).setDuration(300).start();
        return null;
    }
}
