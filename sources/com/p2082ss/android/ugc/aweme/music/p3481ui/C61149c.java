package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.powerlist.PowerList;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.p3481ui.widget.C61234a;
import com.p2082ss.android.ugc.aweme.p2725d.C40910b;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.c */
public final class C61149c extends C17372a {

    /* renamed from: j */
    public static final C61150a f138840j = new C61150a((byte) 0);

    /* renamed from: e */
    public List<ExternalMusicInfo> f138841e;

    /* renamed from: f */
    public boolean f138842f;

    /* renamed from: g */
    public String f138843g;

    /* renamed from: h */
    public String f138844h;

    /* renamed from: i */
    public String f138845i;

    /* renamed from: k */
    private HashMap f138846k;

    static {
        Covode.recordClassIndex(71754);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f138846k == null) {
            this.f138846k = new HashMap();
        }
        View view = (View) this.f138846k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f138846k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f138846k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$a */
    public static final class C61150a {
        static {
            Covode.recordClassIndex(71755);
        }

        private C61150a() {
        }

        public /* synthetic */ C61150a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.c$b */
    static final class C61151b extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61149c f138847a;

        static {
            Covode.recordClassIndex(71756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61151b(C61149c cVar) {
            super(1);
            this.f138847a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f138847a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61149c.C61151b.C611521 */

                /* renamed from: a */
                final /* synthetic */ C61151b f138848a;

                static {
                    Covode.recordClassIndex(71757);
                }

                {
                    this.f138848a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    List<ExternalMusicInfo> list = this.f138848a.f138847a.f138841e;
                    if (list == null) {
                        C89219l.m154710a("mMusicInfoList");
                    }
                    boolean z = this.f138848a.f138847a.f138842f;
                    String str = this.f138848a.f138847a.f138843g;
                    if (str == null) {
                        C89219l.m154710a("processId");
                    }
                    String str2 = this.f138848a.f138847a.f138844h;
                    if (str2 == null) {
                        C89219l.m154710a("musicId");
                    }
                    String str3 = this.f138848a.f138847a.f138845i;
                    if (str3 == null) {
                        C89219l.m154710a("groupId");
                    }
                    iVar2.mo20617a(new C61133b(list, z, str, str2, str3));
                    iVar2.f31027b = "music_info";
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f138847a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3481ui.C61149c.C61151b.C611532 */

                /* renamed from: a */
                final /* synthetic */ C61151b f138849a;

                static {
                    Covode.recordClassIndex(71758);
                }

                {
                    this.f138849a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C61234a.class));
                    qVar2.f31050b = new C61234a();
                    qVar2.f31053e = (PowerList) this.f138849a.f138847a.mo27715a(R.id.dog);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        boolean z;
        String str;
        String str2;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("music_info_list");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.music.model.ExternalMusicInfo> /* = java.util.ArrayList<com.ss.android.ugc.aweme.music.model.ExternalMusicInfo> */");
        this.f138841e = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("is_exclusive_resso");
        } else {
            z = false;
        }
        this.f138842f = z;
        Bundle arguments3 = getArguments();
        String str3 = "";
        if (arguments3 == null || (str = arguments3.getString("process_id")) == null) {
            str = str3;
        }
        this.f138843g = str;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("music_id")) == null) {
            str2 = str3;
        }
        this.f138844h = str2;
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("group_id")) == null)) {
            str3 = string;
        }
        this.f138845i = str3;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C12780d.m23005a(this, new C61151b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C40910b.m82399a(getActivity(), R.layout.ale, layoutInflater, viewGroup);
    }
}
