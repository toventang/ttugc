package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4001a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75938j;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.C75990a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4002b.C75998a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76017a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76019c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.C76022a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4005e.C76023b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a */
public final class C75991a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: i */
    public static final C75992a f170723i = new C75992a((byte) 0);

    /* renamed from: a */
    public int f170724a = -1;

    /* renamed from: b */
    public C75990a f170725b;

    /* renamed from: c */
    public C75998a f170726c;

    /* renamed from: d */
    public final List<C75998a> f170727d = new ArrayList();

    /* renamed from: e */
    public final Map<C75998a, Integer> f170728e = new LinkedHashMap();

    /* renamed from: f */
    public boolean f170729f;

    /* renamed from: g */
    final AbstractC76019c f170730g;

    /* renamed from: h */
    final AbstractC89187q<Integer, Boolean, C75998a, C89391z> f170731h;

    /* renamed from: j */
    private View f170732j;

    /* renamed from: k */
    private C76023b f170733k;

    static {
        Covode.recordClassIndex(88935);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m133258a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a$a */
    public static final class C75992a {
        static {
            Covode.recordClassIndex(88936);
        }

        private C75992a() {
        }

        public /* synthetic */ C75992a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a$d */
    static final class C75995d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C75991a f170736a;

        /* renamed from: b */
        final /* synthetic */ int f170737b;

        static {
            Covode.recordClassIndex(88939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75995d(C75991a aVar, int i) {
            super(0);
            this.f170736a = aVar;
            this.f170737b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo119695a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo119695a() {
            C75991a aVar = this.f170736a;
            aVar.f170726c = aVar.f170727d.get(this.f170737b);
            C75991a aVar2 = this.f170736a;
            aVar2.notifyItemChanged(aVar2.f170724a);
            this.f170736a.notifyItemChanged(this.f170737b);
            this.f170736a.f170724a = this.f170737b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a$e */
    public static final class C75996e implements AbstractC76017a {

        /* renamed from: a */
        final /* synthetic */ C75995d f170738a;

        static {
            Covode.recordClassIndex(88940);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.p4004d.AbstractC76017a
        /* renamed from: a */
        public final void mo119696a() {
            this.f170738a.mo119695a();
        }

        C75996e(C75995d dVar) {
            this.f170738a = dVar;
        }
    }

    /* renamed from: a */
    public final int mo119684a() {
        return this.f170727d.size();
    }

    /* renamed from: c */
    public final int mo119689c() {
        return this.f170728e.size();
    }

    /* renamed from: d */
    public final void mo119690d() {
        this.f170726c = null;
        int i = this.f170724a;
        if (i >= 0) {
            notifyItemChanged(i);
        }
        this.f170724a = -1;
    }

    /* renamed from: e */
    public final void mo119691e() {
        this.f170729f = false;
        C76023b bVar = this.f170733k;
        if (bVar != null) {
            bVar.mo119719a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (this.f170729f) {
            return mo119684a() + 1;
        }
        return mo119684a();
    }

    /* renamed from: f */
    public final void mo119692f() {
        this.f170727d.clear();
        this.f170728e.clear();
        this.f170726c = null;
        this.f170724a = -1;
    }

    /* renamed from: g */
    public final void mo119693g() {
        Iterator<T> it = this.f170727d.iterator();
        while (it.hasNext()) {
            it.next().f170751l = -1;
        }
        this.f170728e.clear();
    }

    /* renamed from: b */
    public final List<C75938j> mo119688b() {
        List<Map.Entry> a = C89070n.m154553a((Iterable) this.f170728e.entrySet(), (Comparator) new C75994c());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : a) {
            C75998a aVar = (C75998a) entry.getKey();
            String str = aVar.f170741b;
            if (str != null) {
                long j = aVar.f170747h;
                int i = aVar.f170748i;
                String str2 = aVar.f170740a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = aVar.f170749j;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new C75938j(str, j, i, str2, str3, "media_tray"));
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (!this.f170729f || i != getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo119685a(C75998a aVar) {
        C89219l.m154721d(aVar, "");
        this.f170727d.add(aVar);
        notifyItemInserted(getItemCount() - 1);
    }

    /* renamed from: a */
    public final void mo119687a(List<C75998a> list) {
        C89219l.m154721d(list, "");
        this.f170727d.clear();
        this.f170727d.addAll(list);
        mo119691e();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo119686a(String str) {
        if (!(TextUtils.isEmpty(str) || this.f170727d.isEmpty())) {
            int size = this.f170727d.size();
            for (int i = 0; i < size; i++) {
                if (C89361p.m154872a(str, this.f170727d.get(i).f170741b, false)) {
                    this.f170726c = this.f170727d.get(i);
                    int i2 = this.f170724a;
                    if (i2 >= 0) {
                        notifyItemChanged(i2);
                    }
                    notifyItemChanged(i);
                    this.f170724a = i;
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a$b */
    public static final class C75993b extends AbstractView$OnClickListenerC81432d {

        /* renamed from: a */
        final /* synthetic */ C75991a f170734a;

        /* renamed from: b */
        final /* synthetic */ C76022a f170735b;

        static {
            Covode.recordClassIndex(88937);
        }

        @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
        /* renamed from: a */
        public final void mo77200a(View view) {
            C75990a aVar = this.f170734a.f170725b;
            if (aVar != null) {
                boolean z = true;
                if (aVar.f170719c) {
                    C75991a aVar2 = this.f170734a;
                    int adapterPosition = this.f170735b.getAdapterPosition();
                    if (adapterPosition >= 0 && adapterPosition < aVar2.f170727d.size()) {
                        C75998a aVar3 = aVar2.f170727d.get(adapterPosition);
                        if (aVar2.f170728e.containsKey(aVar3)) {
                            aVar3.f170751l = -1;
                            Integer remove = aVar2.f170728e.remove(aVar3);
                            if (remove != null) {
                                int intValue = remove.intValue();
                                for (T t : aVar2.f170727d) {
                                    if (t.f170751l != -1 && t.f170751l > intValue) {
                                        t.f170751l--;
                                        aVar2.f170728e.put(t, Integer.valueOf(t.f170751l));
                                    }
                                }
                                z = false;
                            } else {
                                return;
                            }
                        } else {
                            int size = aVar2.f170728e.size();
                            C75990a aVar4 = aVar2.f170725b;
                            if (aVar4 == null || size != aVar4.f170721e) {
                                int size2 = aVar2.f170728e.size() + 1;
                                aVar2.f170728e.put(aVar3, Integer.valueOf(size2));
                                aVar3.f170751l = size2;
                                z = false;
                            }
                        }
                        aVar2.f170731h.invoke(Integer.valueOf(aVar2.f170728e.size()), Boolean.valueOf(z), aVar3);
                        aVar2.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
            }
            C75991a aVar5 = this.f170734a;
            int adapterPosition2 = this.f170735b.getAdapterPosition();
            if (adapterPosition2 >= 0 && adapterPosition2 < aVar5.f170727d.size()) {
                if (adapterPosition2 == aVar5.f170724a) {
                    aVar5.f170726c = null;
                    aVar5.notifyItemChanged(aVar5.f170724a);
                    AbstractC76019c cVar = aVar5.f170730g;
                    if (cVar != null) {
                        cVar.mo119576a();
                    }
                    aVar5.f170724a = -1;
                    return;
                }
                C75995d dVar = new C75995d(aVar5, adapterPosition2);
                if (aVar5.f170730g != null) {
                    aVar5.f170730g.mo119577a(aVar5.f170727d.get(adapterPosition2), new C75996e(dVar));
                    return;
                }
                dVar.mo119695a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75993b(C75991a aVar, C76022a aVar2) {
            super(800);
            this.f170734a = aVar;
            this.f170735b = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.a.a$c */
    public static final class C75994c<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(88938);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a((Integer) t.getValue(), (Integer) t2.getValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        C75990a aVar;
        String str;
        String str2;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C76023b) {
            C76023b bVar = (C76023b) viewHolder;
            View view = bVar.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f170807b, "rotation", 0.0f, 360.0f);
            ofFloat.setDuration(800L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.start();
            bVar.f170806a = ofFloat;
        } else if (viewHolder instanceof C76022a) {
            C76022a aVar2 = (C76022a) viewHolder;
            C75998a aVar3 = this.f170727d.get(i);
            ImageView imageView = aVar2.f170802a;
            C75998a aVar4 = this.f170726c;
            if (aVar4 == null || (str = aVar4.f170741b) == null || str.length() == 0) {
                z = false;
            } else {
                String str3 = aVar4.f170741b;
                if (aVar3 != null) {
                    str2 = aVar3.f170741b;
                } else {
                    str2 = null;
                }
                z = C89219l.m154714a((Object) str3, (Object) str2);
            }
            if (!z || ((aVar = this.f170725b) != null && aVar.f170719c)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            if (aVar3.f170751l != -1) {
                aVar2.f170805d.setVisibility(0);
                aVar2.f170805d.setText(String.valueOf(aVar3.f170751l));
            } else {
                aVar2.f170805d.setVisibility(8);
            }
            Uri d = C84896h.m145871d(aVar3.f170741b);
            Context context = aVar2.f170803b.getContext();
            C89219l.m154716b(context, "");
            int a = (int) C84912r.m145930a(context, 50.0f);
            if (aVar3.f170748i == 3) {
                C84402a.m145185b(aVar2.f170803b, d.toString(), a, a);
            } else {
                C84402a.m145166a(aVar2.f170803b, d, a, a);
            }
            if (aVar3.f170748i == 2) {
                TextView textView = aVar2.f170804c;
                StringBuilder sb = new StringBuilder();
                String a2 = C1764a.m5929a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf((((float) aVar3.f170747h) * 1.0f) / 1000.0f)}, 1));
                C89219l.m154716b(a2, "");
                textView.setText(sb.append(a2).append("s").toString());
                textView.setVisibility(0);
                return;
            }
            aVar2.f170804c.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.q<? super java.lang.Integer, ? super java.lang.Boolean, ? super com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.b.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75991a(Context context, AbstractC76019c cVar, AbstractC89187q<? super Integer, ? super Boolean, ? super C75998a, C89391z> qVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(qVar, "");
        MethodCollector.m26663i(5405);
        this.f170730g = cVar;
        this.f170731h = qVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.a9b, (ViewGroup) null);
        int a = (int) C84912r.m145930a(context, 50.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(a, a);
        marginLayoutParams.rightMargin = (int) C84912r.m145930a(context, 6.5f);
        inflate.setLayoutParams(marginLayoutParams);
        this.f170732j = inflate;
        this.f170729f = true;
        MethodCollector.m26664o(5405);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static RecyclerView.ViewHolder m133258a(C75991a aVar, ViewGroup viewGroup, int i) {
        C76022a aVar2;
        MethodCollector.m26663i(5398);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 1) {
            View view = aVar.f170732j;
            C89219l.m154716b(view, "");
            C76023b bVar = new C76023b(view);
            aVar.f170733k = bVar;
            aVar2 = bVar;
        } else {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9c, viewGroup, false);
            C89219l.m154716b(a, "");
            C76022a aVar3 = new C76022a(a);
            a.setOnClickListener(new C75993b(aVar, aVar3));
            aVar2 = aVar3;
        }
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(5398);
        return aVar2;
    }
}
