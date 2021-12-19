package com.bytedance.android.live.publicscreen.impl.p396c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.impl.p396c.AbstractC5913d;
import com.bytedance.android.livesdk.chatroom.p492g.C7590l;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.utils.C11211ae;
import com.bytedance.android.livesdk.widget.C11424f;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11803e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.c.e */
public final class C5915e extends RecyclerView.AbstractC1350a<AbstractC5917b> {

    /* renamed from: d */
    public static final float f14803d = 3.0f;

    /* renamed from: e */
    public static final float f14804e = 0.53f;

    /* renamed from: f */
    public static final float f14805f = 0.47f;

    /* renamed from: g */
    public static final float f14806g = 0.4f;

    /* renamed from: h */
    public static final float f14807h = 0.65f;

    /* renamed from: i */
    public static int f14808i;

    /* renamed from: j */
    public static final C5916a f14809j = new C5916a((byte) 0);

    /* renamed from: a */
    LayoutInflater f14810a;

    /* renamed from: b */
    List<? extends AbstractC5913d> f14811b;

    /* renamed from: c */
    public Room f14812c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$c */
    public interface AbstractC5918c {
        static {
            Covode.recordClassIndex(6526);
        }

        /* renamed from: a */
        Room mo11780a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$d */
    public static final class C5919d extends AbstractC5917b {

        /* renamed from: c */
        public static float f14813c;

        /* renamed from: d */
        static Paint f14814d = new Paint();

        /* renamed from: e */
        static Paint f14815e = new Paint();

        /* renamed from: f */
        public static final C5920a f14816f = new C5920a((byte) 0);

        /* renamed from: a */
        public TextView f14817a;

        /* renamed from: b */
        public AbstractC5918c f14818b;

        /* renamed from: g */
        private Spannable f14819g;

        /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$d$a */
        public static final class C5920a {
            static {
                Covode.recordClassIndex(6528);
            }

            private C5920a() {
            }

            public /* synthetic */ C5920a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$d$b */
        static final class RunnableC5921b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C5919d f14820a;

            static {
                Covode.recordClassIndex(6529);
            }

            RunnableC5921b(C5919d dVar) {
                this.f14820a = dVar;
            }

            public final void run() {
                if (this.f14820a.f14817a != null) {
                    C5915e.f14808i = this.f14820a.f14817a.getHeight();
                }
            }
        }

        static {
            Covode.recordClassIndex(6527);
        }

        /* renamed from: a */
        private final void m12927a(List<? extends TextImageModel> list) {
            Bitmap a;
            if (!list.isEmpty()) {
                SparseArray<ImageSpan> sparseArray = new SparseArray<>();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((TextImageModel) list.get(i)).f27882c == 2) {
                        Context context = this.f14817a.getContext();
                        int i2 = ((TextImageModel) list.get(i)).f27883d;
                        if ((i2 == C11211ae.f26852a || i2 == C11211ae.f26853b) && (a = C11211ae.m19868a(context, i2, context.getResources().getDimensionPixelSize(R.dimen.x6), context.getResources().getDimensionPixelSize(R.dimen.x5))) != null && !a.isRecycled()) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f14817a.getResources(), a);
                            bitmapDrawable.setBounds(0, 0, a.getWidth(), a.getHeight());
                            sparseArray.put(i, new C11424f(bitmapDrawable));
                            mo11781a(sparseArray, list);
                        }
                    } else {
                        ((AbstractC11803e) C6193a.m13435a(AbstractC11803e.class)).mo18862a((ImageModel) list.get(i), new C5922c(this, sparseArray, i, list));
                    }
                }
            }
        }

        /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$d$c */
        public static final class C5922c implements AbstractC11803e.AbstractC11805b {

            /* renamed from: a */
            final /* synthetic */ C5919d f14821a;

            /* renamed from: b */
            final /* synthetic */ SparseArray f14822b;

            /* renamed from: c */
            final /* synthetic */ int f14823c;

            /* renamed from: d */
            final /* synthetic */ List f14824d;

            static {
                Covode.recordClassIndex(6530);
            }

            @Override // com.bytedance.android.livesdkapi.host.AbstractC11803e.AbstractC11805b
            /* renamed from: a */
            public final void mo8986a(Bitmap bitmap) {
                MethodCollector.m26663i(5664);
                if (bitmap == null) {
                    this.f14822b.put(this.f14823c, null);
                    this.f14821a.mo11781a(this.f14822b, this.f14824d);
                    MethodCollector.m26664o(5664);
                    return;
                }
                TextImageModel textImageModel = (TextImageModel) this.f14824d.get(this.f14823c);
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                float width = ((float) bitmap.getWidth()) * C5919d.f14813c;
                float height = ((float) bitmap.getHeight()) * C5919d.f14813c;
                if (!TextUtils.isEmpty(textImageModel.f27880a) && textImageModel.f27882c == 1) {
                    String str = textImageModel.f27880a;
                    C89219l.m154716b(str, "");
                    C89219l.m154716b(copy, "");
                    float width2 = (float) bitmap.getWidth();
                    float height2 = (float) bitmap.getHeight();
                    C5919d.f14814d.setTextSize(C5915e.f14804e * height2);
                    C5919d.f14815e.setColor(-1);
                    float measureText = C5919d.f14814d.measureText(str);
                    float f = width2 - height2;
                    if (measureText > f) {
                        measureText = f;
                    }
                    Canvas canvas = new Canvas(copy);
                    Paint.FontMetrics fontMetrics = C5919d.f14814d.getFontMetrics();
                    canvas.drawText(str, height2 + ((f - measureText) / 2.0f), ((height2 - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + Math.abs(fontMetrics.ascent), C5919d.f14814d);
                } else if (!TextUtils.isEmpty(textImageModel.f27880a) && textImageModel.f27882c == 3) {
                    this.f14821a.f14817a.getContext();
                    String str2 = textImageModel.f27880a;
                    if (!(copy == null || str2 == null)) {
                        C7590l.f18824a.setColor(-1);
                        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41567a);
                        if (a != null) {
                            C7590l.f18824a.setTypeface(a);
                        }
                        float width3 = (float) copy.getWidth();
                        float height3 = (float) copy.getHeight();
                        C7590l.f18824a.setTextSize(0.55f * height3);
                        float measureText2 = C7590l.f18824a.measureText(str2);
                        Canvas canvas2 = new Canvas(copy);
                        Paint.FontMetrics fontMetrics2 = C7590l.f18824a.getFontMetrics();
                        canvas2.drawText(str2, height3 + (((width3 - height3) - measureText2) / 2.0f), ((height3 - (fontMetrics2.bottom - fontMetrics2.top)) / 2.0f) + Math.abs(fontMetrics2.top), C7590l.f18824a);
                    }
                }
                if (textImageModel.f27882c == 4) {
                    String str3 = textImageModel.f27880a;
                    C89219l.m154716b(str3, "");
                    int i = textImageModel.f27881b;
                    C89219l.m154716b(copy, "");
                    float width4 = (float) bitmap.getWidth();
                    float height4 = (float) bitmap.getHeight();
                    C5919d.f14815e.setTextSize(C5915e.f14805f * height4);
                    C5919d.f14815e.setColor(i);
                    float measureText3 = C5919d.f14815e.measureText(str3);
                    float f2 = width4 - height4;
                    if (measureText3 > f2) {
                        measureText3 = f2;
                    }
                    Canvas canvas3 = new Canvas(copy);
                    Paint.FontMetrics fontMetrics3 = C5919d.f14815e.getFontMetrics();
                    canvas3.drawText(str3, height4 + ((f2 - measureText3) * C5915e.f14806g), ((height4 - (fontMetrics3.descent - fontMetrics3.ascent)) * C5915e.f14807h) + Math.abs(fontMetrics3.ascent), C5919d.f14815e);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f14821a.f14817a.getResources(), copy);
                bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                this.f14822b.put(this.f14823c, new C11424f(bitmapDrawable));
                this.f14821a.mo11781a(this.f14822b, this.f14824d);
                MethodCollector.m26664o(5664);
            }

            C5922c(C5919d dVar, SparseArray sparseArray, int i, List list) {
                this.f14821a = dVar;
                this.f14822b = sparseArray;
                this.f14823c = i;
                this.f14824d = list;
            }
        }

        @Override // com.bytedance.android.live.publicscreen.impl.p396c.C5915e.AbstractC5917b
        /* renamed from: a */
        public final void mo11779a(AbstractC5913d dVar) {
            Spannable spannable;
            User owner;
            FansClubMember fansClub;
            FansClubData fansClubData;
            ImageModel imageModel;
            if (dVar != null) {
                spannable = dVar.mo11772b();
            } else {
                spannable = null;
            }
            this.f14819g = spannable;
            this.f14817a.setText(spannable);
            this.f14817a.setBackgroundResource(R.drawable.bt8);
            this.f14817a.setTextColor(C3966y.m9663b((int) R.color.yc));
            if (dVar != null && dVar.mo11771a() == AbstractC5913d.C5914a.f14801c) {
                ArrayList arrayList = new ArrayList();
                Room a = this.f14818b.mo11780a();
                if (!(a == null || (owner = a.getOwner()) == null || (fansClub = owner.getFansClub()) == null)) {
                    if (FansClubData.isValid(fansClub.getData())) {
                        fansClubData = fansClub.getData();
                    } else {
                        fansClubData = fansClub.getPreferData().get(1);
                    }
                    if (!(!FansClubData.isValid(fansClubData) || fansClubData == null || (imageModel = fansClubData.badge.icons.get(2)) == null)) {
                        TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                        textImageModel.f27880a = fansClubData.clubName;
                        arrayList.add(textImageModel);
                    }
                }
                m12927a(arrayList);
            }
            this.f14817a.post(new RunnableC5921b(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5919d(View view, AbstractC5918c cVar) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(cVar, "");
            this.f14818b = cVar;
            View findViewById = view.findViewById(R.id.text);
            C89219l.m154716b(findViewById, "");
            this.f14817a = (TextView) findViewById;
            if (f14813c <= 0.0f) {
                Resources resources = view.getResources();
                C89219l.m154716b(resources, "");
                f14813c = resources.getDisplayMetrics().density / C5915e.f14803d;
            }
            f14814d.setColor(-1);
            f14814d.setStyle(Paint.Style.FILL_AND_STROKE);
            f14814d.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            f14815e.setStyle(Paint.Style.FILL_AND_STROKE);
            f14815e.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }

        /* renamed from: a */
        public final void mo11781a(SparseArray<ImageSpan> sparseArray, List<? extends TextImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ImageSpan imageSpan = sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append((CharSequence) "0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                }
                spannableStringBuilder.append((CharSequence) this.f14819g);
                this.f14817a.setText(spannableStringBuilder);
            }
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractC5917b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m12923a(this, viewGroup, i);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$a */
    public static final class C5916a {
        static {
            Covode.recordClassIndex(6524);
        }

        private C5916a() {
        }

        public /* synthetic */ C5916a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$e */
    public static final class C5923e implements AbstractC5918c {

        /* renamed from: a */
        final /* synthetic */ C5915e f14825a;

        static {
            Covode.recordClassIndex(6531);
        }

        @Override // com.bytedance.android.live.publicscreen.impl.p396c.C5915e.AbstractC5918c
        /* renamed from: a */
        public final Room mo11780a() {
            return this.f14825a.f14812c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5923e(C5915e eVar) {
            this.f14825a = eVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<? extends AbstractC5913d> list = this.f14811b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(6523);
    }

    /* renamed from: a */
    public final void mo11778a(Room room) {
        C89219l.m154721d(room, "");
        this.f14812c = room;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$b */
    public static abstract class AbstractC5917b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(6525);
        }

        /* renamed from: a */
        public abstract void mo11779a(AbstractC5913d dVar);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AbstractC5917b(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        AbstractC5913d dVar;
        List<? extends AbstractC5913d> list = this.f14811b;
        if (list == null || (dVar = (AbstractC5913d) list.get(i)) == null) {
            return 0;
        }
        return dVar.mo11771a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractC5917b bVar, int i) {
        AbstractC5913d dVar;
        AbstractC5917b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        List<? extends AbstractC5913d> list = this.f14811b;
        if (list != null) {
            dVar = (AbstractC5913d) list.get(i);
        } else {
            dVar = null;
        }
        bVar2.mo11779a(dVar);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m12923a(C5915e eVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5404);
        C89219l.m154721d(viewGroup, "");
        LayoutInflater layoutInflater = eVar.f14810a;
        if (layoutInflater == null) {
            C89219l.m154715b();
        }
        View a2 = C1764a.m5927a(layoutInflater, R.layout.b9m, viewGroup, false);
        C89219l.m154716b(a2, "");
        C5919d dVar = new C5919d(a2, new C5923e(eVar));
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
        MethodCollector.m26664o(5404);
        return dVar;
    }
}
