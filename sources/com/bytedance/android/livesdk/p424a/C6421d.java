package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.uikit.recyclerview.AbstractC6235a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.a.d */
public final class C6421d extends AbstractC6235a {

    /* renamed from: c */
    public AbstractC6419b f15997c;

    /* renamed from: d */
    public boolean f15998d;

    /* renamed from: e */
    private Context f15999e;

    /* renamed from: f */
    private List<User> f16000f = new ArrayList();

    /* renamed from: g */
    private String f16001g;

    /* renamed from: h */
    private long f16002h;

    /* renamed from: i */
    private long f16003i;

    static {
        Covode.recordClassIndex(7157);
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.AbstractC6239b
    /* renamed from: c */
    public final int mo12221c() {
        if (this.f15998d) {
            return this.f16000f.size() + 1;
        }
        return this.f16000f.size();
    }

    /* renamed from: com.bytedance.android.livesdk.a.d$a */
    static class C6422a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f16004a;

        static {
            Covode.recordClassIndex(7158);
        }

        public C6422a(View view) {
            super(view);
            this.f16004a = (TextView) view.findViewById(R.id.esr);
        }
    }

    /* renamed from: a */
    public final void mo12580a(Collection<? extends User> collection) {
        if (collection != null && collection.size() > 0) {
            this.f16000f.addAll(collection);
        }
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.AbstractC6239b
    /* renamed from: a */
    public final int mo12218a(int i) {
        if (!this.f15998d || i != this.f16000f.size()) {
            return super.mo12218a(i);
        }
        return 4099;
    }

    /* renamed from: a */
    public final void mo12579a(long j) {
        for (int size = this.f16000f.size() - 1; size >= 0; size--) {
            User user = this.f16000f.get(size);
            if (user != null && user.getId() == j) {
                this.f16000f.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.AbstractC6239b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo12219a(ViewGroup viewGroup, int i) {
        if (i == 4099) {
            return new C6422a(C1764a.m5927a(LayoutInflater.from(this.f15999e), R.layout.b9h, viewGroup, false));
        }
        Context context = this.f15999e;
        return new C6424f(context, C1764a.m5927a(LayoutInflater.from(context), R.layout.b9c, viewGroup, false), this.f16001g, this.f16002h, this.f16003i, this.f15997c);
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.AbstractC6239b
    /* renamed from: a */
    public final void mo12220a(RecyclerView.ViewHolder viewHolder, int i) {
        List<User> list;
        ImageModel o;
        int i2;
        if (getItemViewType(i) == 4099) {
            C6422a aVar = (C6422a) viewHolder;
            if (aVar != null) {
                String str = this.f16001g;
                TextView textView = aVar.f16004a;
                if (str.equals("activity_kick_out")) {
                    i2 = R.string.glg;
                } else {
                    i2 = R.string.glf;
                }
                textView.setText(i2);
                return;
            }
            return;
        }
        C6424f fVar = (C6424f) viewHolder;
        if (fVar != null && (list = this.f16000f) != null) {
            fVar.f16013i = list;
            User user = list.get(i);
            if (user != null) {
                fVar.f16007c.setVisibility(0);
                if (user.getAvatarThumb() != null) {
                    C3951p.m9621a(fVar.f16005a, user.getAvatarThumb());
                } else {
                    fVar.f16005a.setImageResource(2131234441);
                }
                fVar.f16005a.setOnClickListener(new View$OnClickListenerC6426g(user));
                fVar.f16010f.setText(user.getDisplayId());
                fVar.f16009e.setText(user.getNickName());
                if (user.getUserHonor() == null || (o = user.getUserHonor().mo16485o()) == null || C13603b.m24435a((Collection) o.getUrls())) {
                    fVar.f16011g.setVisibility(8);
                } else {
                    C3951p.m9627a(fVar.f16011g, o, 0, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0087: INVOKE  
                          (wrap: com.bytedance.android.live.core.widget.HSImageView : 0x0080: IGET  (r1v9 com.bytedance.android.live.core.widget.HSImageView) = (r5v1 'fVar' com.bytedance.android.livesdk.a.f) com.bytedance.android.livesdk.a.f.g com.bytedance.android.live.core.widget.HSImageView)
                          (r2v2 'o' com.bytedance.android.live.base.model.ImageModel)
                          (0 int)
                          (wrap: com.bytedance.android.livesdk.a.f$1 : 0x0084: CONSTRUCTOR  (r0v17 com.bytedance.android.livesdk.a.f$1) = (r5v1 'fVar' com.bytedance.android.livesdk.a.f) call: com.bytedance.android.livesdk.a.f.1.<init>(com.bytedance.android.livesdk.a.f):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.android.live.core.f.p.a(android.widget.ImageView, com.bytedance.android.live.base.model.ImageModel, int, com.bytedance.android.live.core.f.p$a):void in method: com.bytedance.android.livesdk.a.d.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0084: CONSTRUCTOR  (r0v17 com.bytedance.android.livesdk.a.f$1) = (r5v1 'fVar' com.bytedance.android.livesdk.a.f) call: com.bytedance.android.livesdk.a.f.1.<init>(com.bytedance.android.livesdk.a.f):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.a.d.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 37 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.a.f, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 43 more
                        */
                    /*
                    // Method dump skipped, instructions count: 189
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p424a.C6421d.mo12220a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
                }

                public C6421d(Context context, String str, long j, long j2) {
                    this.f15999e = context;
                    this.f16001g = str;
                    this.f16002h = j;
                    this.f16003i = j2;
                }
            }
