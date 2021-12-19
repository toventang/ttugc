package com.bytedance.android.livesdk.p433ac;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.C1764a;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.p405s.p406a.C6096a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9136r;
import com.bytedance.android.livesdk.p561j.C9137s;
import com.bytedance.android.livesdk.p561j.EnumC9135q;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.ac.g */
public final class C6591g extends C10935a {

    /* renamed from: a */
    public C6584b f16489a;

    /* renamed from: b */
    private HashMap f16490b;

    static {
        Covode.recordClassIndex(7327);
    }

    /* renamed from: a */
    public final View mo12745a(int i) {
        if (this.f16490b == null) {
            this.f16490b = new HashMap();
        }
        View view = (View) this.f16490b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f16490b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16490b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    private final long m14090a() {
        Room room;
        if (C11279p.m20022c()) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            return b.mo13161c();
        }
        DataChannel a = C17846f.m33055a(this);
        if (a == null || (room = (Room) a.mo28318b(C9093de.class)) == null) {
            return 0;
        }
        return room.getOwnerUserId();
    }

    /* renamed from: com.bytedance.android.livesdk.ac.g$d */
    public static final class C6595d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C6591g f16495a;

        static {
            Covode.recordClassIndex(7331);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6595d(C6591g gVar) {
            this.f16495a = gVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C6591g gVar = this.f16495a;
            C6584b bVar = gVar.f16489a;
            if (bVar != null) {
                LiveEditText liveEditText = (LiveEditText) gVar.mo12745a(R.id.drj);
                C89219l.m154716b(liveEditText, "");
                Editable text = liveEditText.getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                C89219l.m154721d(str, "");
                List<C6096a> list = bVar.f16465b;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    String str2 = t2.f15233c;
                    Boolean bool = null;
                    if (!C11279p.m20012a(str2 != null ? Boolean.valueOf(C89361p.m154908a((CharSequence) str2, (CharSequence) str, true)) : null)) {
                        String str3 = t2.f15234d;
                        if (str3 != null) {
                            bool = Boolean.valueOf(C89361p.m154908a((CharSequence) str3, (CharSequence) str, true));
                        }
                        if (!C11279p.m20012a(bool)) {
                        }
                    }
                    arrayList.add(t);
                }
                bVar.f16464a = C89070n.m154585g((Collection) arrayList);
                bVar.notifyDataSetChanged();
                AbstractC89172b<? super Boolean, C89391z> bVar2 = bVar.f16466c;
                if (bVar2 != null) {
                    bVar2.invoke(Boolean.valueOf(bVar.f16464a.isEmpty()));
                }
            }
            LiveEditText liveEditText2 = (LiveEditText) this.f16495a.mo12745a(R.id.drj);
            C89219l.m154716b(liveEditText2, "");
            if (C11279p.m20013a(liveEditText2.getText())) {
                C11279p.m20017b(this.f16495a.mo12745a(R.id.ds0));
            } else {
                C11279p.m20006a(this.f16495a.mo12745a(R.id.ds0));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.g$b */
    static final class C6593b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6591g f16493a;

        static {
            Covode.recordClassIndex(7329);
        }

        C6593b(C6591g gVar) {
            this.f16493a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C6584b bVar = this.f16493a.f16489a;
            if (bVar != null) {
                bVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.g$c */
    static final class View$OnClickListenerC6594c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6591g f16494a;

        static {
            Covode.recordClassIndex(7330);
        }

        View$OnClickListenerC6594c(C6591g gVar) {
            this.f16494a = gVar;
        }

        public final void onClick(View view) {
            LiveEditText liveEditText = (LiveEditText) this.f16494a.mo12745a(R.id.drj);
            C89219l.m154716b(liveEditText, "");
            Editable text = liveEditText.getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    /* renamed from: com.bytedance.android.livesdk.ac.g$a */
    static final class C6592a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6591g f16491a;

        /* renamed from: b */
        final /* synthetic */ List f16492b;

        static {
            Covode.recordClassIndex(7328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6592a(C6591g gVar, List list) {
            super(1);
            this.f16491a = gVar;
            this.f16492b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C11279p.m20008a(this.f16491a.mo12745a(R.id.ewg), !booleanValue);
            C11279p.m20008a(this.f16491a.mo12745a(R.id.dsf), !booleanValue);
            C11279p.m20008a(this.f16491a.mo12745a(R.id.drl), booleanValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.g$e */
    static final class View$OnClickListenerC6596e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6591g f16496a;

        static {
            Covode.recordClassIndex(7332);
        }

        View$OnClickListenerC6596e(C6591g gVar) {
            this.f16496a = gVar;
        }

        public final void onClick(View view) {
            LiveEditText liveEditText = (LiveEditText) this.f16496a.mo12745a(R.id.drj);
            C89219l.m154716b(liveEditText, "");
            C11279p.m20016b((EditText) liveEditText);
            DataChannel a = C17846f.m33055a(this.f16496a);
            if (a != null) {
                a.mo28315b(C9136r.class, C9137s.m17356a(EnumC9135q.MODERATOR_LIST));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r3 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r3 = (java.util.List) r3.mo28318b(com.bytedance.android.livesdk.p433ac.C6597h.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r3 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r4 = new java.util.ArrayList(p4600h.p4601a.C89070n.m154526a((java.lang.Iterable) r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r3.hasNext() == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r4.add(java.lang.Long.valueOf(((com.bytedance.android.live.p405s.p406a.C6096a) r3.next()).f15231a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r4 = p4600h.p4601a.C89086z.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        r1 = new java.util.ArrayList(p4600h.p4601a.C89070n.m154526a((java.lang.Iterable) r7, 10));
        r6 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if (r6.hasNext() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r5 = r6.next();
        r15 = p4600h.p4601a.C89070n.m154556a(r4, r5.f28221a);
        p4600h.p4611f.p4613b.C89219l.m154721d(r5, "");
        r3 = r5.f28221a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        if (r3 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        r8 = r3.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        r10 = r5.f28222b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ba, code lost:
        if (r10 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r1.add(new com.bytedance.android.live.p405s.p406a.C6096a(r8, r10, r5.f28223c, r5.f28224d, r5.f28225e, null, r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        r1 = r1;
        r7 = m14090a();
        r4 = com.bytedance.ies.sdk.datachannel.C17846f.m33055a(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
        if (r4 == null) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        r3 = (java.lang.Long) r4.mo28318b(com.bytedance.android.livesdk.p561j.C9096dh.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        if (r3 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e7, code lost:
        p4600h.p4611f.p4613b.C89219l.m154715b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        r5 = new com.bytedance.android.livesdk.p433ac.C6584b("friend_panel", r7, true, r3.longValue());
        r5.mo12741a(r1);
        r3 = new com.bytedance.android.livesdk.p433ac.C6591g.C6592a(r16, r1);
        p4600h.p4611f.p4613b.C89219l.m154721d(r3, "");
        r5.f16466c = r3;
        r16.f16489a = r5;
        register(com.bytedance.android.livesdk.p449am.C6779a.m14563a().mo13052a(com.bytedance.android.livesdk.p433ac.C6590f.class).mo143289d(new com.bytedance.android.livesdk.p433ac.C6591g.C6593b(r16)));
        com.bytedance.android.livesdk.utils.C11279p.m20017b(mo12745a(com.p2082ss.android.ugc.trill.R.id.dsf));
        com.bytedance.android.livesdk.utils.C11279p.m20017b(mo12745a(com.p2082ss.android.ugc.trill.R.id.ewg));
        com.bytedance.android.livesdk.utils.C11279p.m20017b(mo12745a(com.p2082ss.android.ugc.trill.R.id.drt));
        r2 = (androidx.recyclerview.widget.RecyclerView) mo12745a(com.p2082ss.android.ugc.trill.R.id.dsf);
        r2.setAdapter(r16.f16489a);
        r2.getContext();
        r2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager());
        ((android.widget.ImageView) mo12745a(com.p2082ss.android.ugc.trill.R.id.ds0)).setOnClickListener(new com.bytedance.android.livesdk.p433ac.C6591g.View$OnClickListenerC6594c(r16));
        ((com.bytedance.android.live.design.widget.LiveEditText) mo12745a(com.p2082ss.android.ugc.trill.R.id.drj)).addTextChangedListener(new com.bytedance.android.livesdk.p433ac.C6591g.C6595d(r16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0172 A[EDGE_INSN: B:47:0x0172->B:42:0x0172 ?: BREAK  , SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 398
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p433ac.C6591g.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b56, viewGroup, false);
    }
}
