package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3106b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.GroupGreetingContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.d */
public final class C54069d extends AbstractC54482a<GroupGreetingContent> {

    /* renamed from: a */
    public static final C54070a f123920a = new C54070a((byte) 0);

    /* renamed from: b */
    private List<C54066b> f123921b = new ArrayList();

    /* renamed from: x */
    private final AbstractC89244h f123922x = C89250i.m154773a((AbstractC89171a) C54071b.f123923a);

    static {
        Covode.recordClassIndex(63744);
    }

    /* renamed from: i */
    private final C54065a m99267i() {
        return (C54065a) this.f123922x.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.d$a */
    public static final class C54070a {
        static {
            Covode.recordClassIndex(63745);
        }

        private C54070a() {
        }

        public /* synthetic */ C54070a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.d$b */
    static final class C54071b extends AbstractC89220m implements AbstractC89171a<C54065a> {

        /* renamed from: a */
        public static final C54071b f123923a = new C54071b();

        static {
            Covode.recordClassIndex(63746);
        }

        C54071b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C54065a invoke() {
            return new C54065a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54069d(View view, EnumC53772b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final /* synthetic */ void mo91008a(C19538ai aiVar, C19538ai aiVar2, GroupGreetingContent groupGreetingContent, int i) {
        List<IMUser> userList;
        GroupGreetingContent groupGreetingContent2 = groupGreetingContent;
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, groupGreetingContent2, i);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) layoutParams;
        jVar.setMargins(0, this.f124808d, 0, 0);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        view2.setLayoutParams(jVar);
        this.f123921b.clear();
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.bc8);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(m99267i());
        View view4 = this.itemView;
        C89219l.m154716b(view4, "");
        RecyclerView recyclerView2 = (RecyclerView) view4.findViewById(R.id.bc8);
        C89219l.m154716b(recyclerView2, "");
        View view5 = this.itemView;
        C89219l.m154716b(view5, "");
        view5.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        if (!(groupGreetingContent2 == null || (userList = groupGreetingContent2.getUserList()) == null)) {
            if (userList.size() > 6) {
                List<C54066b> list = this.f123921b;
                List<IMUser> subList = userList.subList(0, 6);
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) subList, 10));
                Iterator<T> it = subList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C54066b(it.next()));
                }
                list.addAll(C89070n.m154554a((Collection) arrayList, (Object) new C54066b(null, userList.size() - 6)));
            } else {
                List<C54066b> list2 = this.f123921b;
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) userList, 10));
                Iterator<T> it2 = userList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C54066b(it2.next()));
                }
                list2.addAll(arrayList2);
            }
        }
        m99267i().mo67829d(false);
        m99267i().mo62377b_(this.f123921b);
    }
}
