package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.api.NotificationApi;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61867b;
import com.p2082ss.android.ugc.aweme.notification.bean.EnumC61874i;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.AbstractC62398e;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.p3536a.C62401f;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.c */
public class C62455c {

    /* renamed from: c */
    public static final C62456a f141690c = new C62456a((byte) 0);

    /* renamed from: a */
    public final C62401f f141691a;

    /* renamed from: b */
    public final int f141692b;

    /* renamed from: d */
    private final AbstractC89244h f141693d = C89250i.m154773a((AbstractC89171a) C62463h.f141708a);

    /* renamed from: e */
    private final AbstractC89244h f141694e = C89250i.m154773a((AbstractC89171a) C62473l.f141718a);

    /* renamed from: f */
    private final AbstractC89244h f141695f = C89250i.m154773a((AbstractC89171a) C62468j.f141713a);

    /* renamed from: g */
    private final AbstractC89244h f141696g = C89250i.m154773a((AbstractC89171a) C62462g.f141707a);

    /* renamed from: h */
    private final AbstractC89244h f141697h = C89250i.m154773a((AbstractC89171a) C62459d.f141704a);

    /* renamed from: i */
    private final AbstractC89244h f141698i = C89250i.m154773a((AbstractC89171a) C62460e.f141705a);

    /* renamed from: j */
    private final AbstractC89244h f141699j = C89250i.m154773a((AbstractC89171a) C62461f.f141706a);

    static {
        Covode.recordClassIndex(73245);
    }

    /* renamed from: a */
    public final C33943c<List<MusNotice>> mo100431a() {
        return (C33943c) this.f141693d.getValue();
    }

    /* renamed from: b */
    public final C33943c<EnumC61874i> mo100436b() {
        return (C33943c) this.f141694e.getValue();
    }

    /* renamed from: c */
    public final C33943c<EnumC61874i> mo100437c() {
        return (C33943c) this.f141695f.getValue();
    }

    /* renamed from: e */
    public final C33943c<Boolean> mo100439e() {
        return (C33943c) this.f141696g.getValue();
    }

    /* renamed from: f */
    public final C33943c<C89378p<MusNotice, EnumC61867b>> mo100440f() {
        return (C33943c) this.f141697h.getValue();
    }

    /* renamed from: g */
    public final C88411a mo100441g() {
        return (C88411a) this.f141698i.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final CopyOnWriteArraySet<String> mo100442h() {
        return (CopyOnWriteArraySet) this.f141699j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$a */
    public static final class C62456a {
        static {
            Covode.recordClassIndex(73246);
        }

        private C62456a() {
        }

        public /* synthetic */ C62456a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$d */
    static final class C62459d extends AbstractC89220m implements AbstractC89171a<C33943c<C89378p<? extends MusNotice, ? extends EnumC61867b>>> {

        /* renamed from: a */
        public static final C62459d f141704a = new C62459d();

        static {
            Covode.recordClassIndex(73249);
        }

        C62459d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C89378p<? extends MusNotice, ? extends EnumC61867b>> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$e */
    static final class C62460e extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C62460e f141705a = new C62460e();

        static {
            Covode.recordClassIndex(73250);
        }

        C62460e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$f */
    static final class C62461f extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<String>> {

        /* renamed from: a */
        public static final C62461f f141706a = new C62461f();

        static {
            Covode.recordClassIndex(73251);
        }

        C62461f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<String> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$g */
    static final class C62462g extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C62462g f141707a = new C62462g();

        static {
            Covode.recordClassIndex(73252);
        }

        C62462g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$h */
    static final class C62463h extends AbstractC89220m implements AbstractC89171a<C33943c<List<? extends MusNotice>>> {

        /* renamed from: a */
        public static final C62463h f141708a = new C62463h();

        static {
            Covode.recordClassIndex(73253);
        }

        C62463h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<List<? extends MusNotice>> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$j */
    static final class C62468j extends AbstractC89220m implements AbstractC89171a<C33943c<EnumC61874i>> {

        /* renamed from: a */
        public static final C62468j f141713a = new C62468j();

        static {
            Covode.recordClassIndex(73258);
        }

        C62468j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<EnumC61874i> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$l */
    static final class C62473l extends AbstractC89220m implements AbstractC89171a<C33943c<EnumC61874i>> {

        /* renamed from: a */
        public static final C62473l f141718a = new C62473l();

        static {
            Covode.recordClassIndex(73263);
        }

        C62473l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<EnumC61874i> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: k */
    private static boolean mo100450k() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public boolean mo100443i() {
        return mo100435a(new C62469k(this));
    }

    /* renamed from: j */
    public boolean mo100444j() {
        return mo100435a(new C62464i(this));
    }

    /* renamed from: d */
    public final boolean mo100438d() {
        if (mo100436b().getValue() == EnumC61874i.LOADING || mo100437c().getValue() == EnumC61874i.LOADING) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$k */
    public static final class C62469k extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C62455c f141714a;

        static {
            Covode.recordClassIndex(73259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62469k(C62455c cVar) {
            super(0);
            this.f141714a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.f141714a.mo100438d()) {
                C39109f.m79404c("NotificationModel", "refresh but loading now");
                z = false;
            } else {
                C39109f.m79403b("NotificationModel", "refresh start");
                C61862a.m111998a(this.f141714a.mo100436b(), EnumC61874i.LOADING);
                AbstractC88412b a = this.f141714a.f141691a.mo100367b().mo143292d(new AbstractC88434g(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c.C62469k.C624701 */

                    /* renamed from: a */
                    final /* synthetic */ C62469k f141715a;

                    static {
                        Covode.recordClassIndex(73260);
                    }

                    {
                        this.f141715a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
                        C89219l.m154721d(bVar, "");
                        return new AbstractC62398e.C62400b(bVar.f141595a, this.f141715a.f141714a.mo100432a(C89070n.m154585g((Collection) bVar.f141596b)), bVar.f141597c);
                    }
                }).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c.C62469k.C624712 */

                    /* renamed from: a */
                    final /* synthetic */ C62469k f141716a;

                    static {
                        Covode.recordClassIndex(73261);
                    }

                    {
                        this.f141716a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        EnumC61874i iVar;
                        AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
                        C39109f.m79403b("NotificationModel", "refresh end:" + bVar.f141596b.size() + ", " + bVar.f141595a.mo100369d());
                        this.f141716a.f141714a.mo100439e().setValue(Boolean.valueOf(bVar.f141595a.mo100369d()));
                        this.f141716a.f141714a.mo100431a().setValue(bVar.f141596b);
                        C33943c<EnumC61874i> b = this.f141716a.f141714a.mo100436b();
                        if (!bVar.f141596b.isEmpty() || bVar.f141597c == null) {
                            iVar = EnumC61874i.SUCCESS;
                        } else {
                            iVar = EnumC61874i.ERROR;
                        }
                        b.setValue(iVar);
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c.C62469k.C624723 */

                    /* renamed from: a */
                    final /* synthetic */ C62469k f141717a;

                    static {
                        Covode.recordClassIndex(73262);
                    }

                    {
                        this.f141717a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C39109f.m79404c("NotificationModel", "refresh error:" + ((Throwable) obj).getMessage());
                        this.f141717a.f141714a.mo100436b().setValue(EnumC61874i.ERROR);
                    }
                });
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f141714a.mo100441g());
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$i */
    public static final class C62464i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C62455c f141709a;

        static {
            Covode.recordClassIndex(73254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62464i(C62455c cVar) {
            super(0);
            this.f141709a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (this.f141709a.mo100438d() || (!C89219l.m154714a((Object) this.f141709a.mo100439e().getValue(), (Object) true))) {
                C39109f.m79404c("NotificationModel", "loadMore blocked by:" + this.f141709a.mo100438d() + ", " + this.f141709a.mo100439e().getValue());
                z = false;
            } else {
                C39109f.m79403b("NotificationModel", "loadMore start");
                C61862a.m111998a(this.f141709a.mo100437c(), EnumC61874i.LOADING);
                AbstractC88412b a = this.f141709a.f141691a.mo100368c().mo143292d(new AbstractC88434g(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c.C62464i.C624651 */

                    /* renamed from: a */
                    final /* synthetic */ C62464i f141710a;

                    static {
                        Covode.recordClassIndex(73255);
                    }

                    {
                        this.f141710a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88434g
                    public final /* synthetic */ Object apply(Object obj) {
                        AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
                        C89219l.m154721d(bVar, "");
                        return new AbstractC62398e.C62400b(bVar.f141595a, this.f141710a.f141709a.mo100432a(C89070n.m154585g((Collection) bVar.f141596b)));
                    }
                }).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c.C62464i.C624662 */

                    /* renamed from: a */
                    final /* synthetic */ C62464i f141711a;

                    static {
                        Covode.recordClassIndex(73256);
                    }

                    {
                        this.f141711a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        AbstractC62398e.C62400b bVar = (AbstractC62398e.C62400b) obj;
                        C39109f.m79403b("NotificationModel", "loadMore end:" + bVar.f141596b.size() + ", " + bVar.f141595a.mo100369d());
                        this.f141711a.f141709a.mo100439e().setValue(Boolean.valueOf(bVar.f141595a.mo100369d()));
                        this.f141711a.f141709a.mo100431a().setValue(bVar.f141596b);
                        this.f141711a.f141709a.mo100437c().setValue(EnumC61874i.SUCCESS);
                    }
                }, new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.notification.p3535vm.C62455c.C62464i.C624673 */

                    /* renamed from: a */
                    final /* synthetic */ C62464i f141712a;

                    static {
                        Covode.recordClassIndex(73257);
                    }

                    {
                        this.f141712a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C39109f.m79404c("NotificationModel", "loadMore error:" + ((Throwable) obj).getMessage());
                        this.f141712a.f141709a.mo100437c().setValue(EnumC61874i.ERROR);
                    }
                });
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f141709a.mo100441g());
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$b */
    public static final class C62457b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C62455c f141700a;

        /* renamed from: b */
        final /* synthetic */ MusNotice f141701b;

        static {
            Covode.recordClassIndex(73247);
        }

        C62457b(C62455c cVar, MusNotice musNotice) {
            this.f141700a = cVar;
            this.f141701b = musNotice;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f141700a.mo100440f().setValue(C89387v.m154943a(this.f141701b, EnumC61867b.SUCCESS));
            C62259e.m112613a(this.f141701b, (BaseResponse) obj, (Throwable) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.vm.c$c */
    public static final class C62458c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C62455c f141702a;

        /* renamed from: b */
        final /* synthetic */ MusNotice f141703b;

        static {
            Covode.recordClassIndex(73248);
        }

        C62458c(C62455c cVar, MusNotice musNotice) {
            this.f141702a = cVar;
            this.f141703b = musNotice;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C39109f.m79401a("NotificationModel", "deleteData error", th);
            this.f141702a.mo100440f().setValue(C89387v.m154943a(this.f141703b, EnumC61867b.REQ_ERR));
            C62259e.m112613a(this.f141703b, (BaseResponse) null, th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo100435a(AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        if (!C62269l.m112652a()) {
            return aVar.invoke().booleanValue();
        }
        C39109f.m79404c("NotificationModel", "load but children mode");
        C61862a.m111998a(mo100431a(), C89086z.INSTANCE);
        return false;
    }

    public C62455c(int i) {
        this.f141692b = i;
        this.f141691a = new C62401f(i);
    }

    /* renamed from: a */
    public final void mo100433a(int i) {
        Integer num;
        List<MusNotice> value = mo100431a().getValue();
        if (value != null && !value.isEmpty()) {
            int size = value.size();
            if (i >= 0 && size > i) {
                mo100434a(value.get(i));
                return;
            }
        }
        StringBuilder append = new StringBuilder("deleteData but position invalid:").append(i).append(", ");
        if (value != null) {
            num = Integer.valueOf(value.size());
        } else {
            num = null;
        }
        C39109f.m79404c("NotificationModel", append.append(num).toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List<MusNotice> mo100432a(List<MusNotice> list) {
        boolean z;
        C89219l.m154721d(list, "");
        ListIterator<MusNotice> listIterator = list.listIterator();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (listIterator.hasNext()) {
            MusNotice next = listIterator.next();
            if (mo100442h().contains(next.nid)) {
                listIterator.remove();
            } else {
                MusNotice musNotice = (MusNotice) linkedHashMap.get(Long.valueOf(next.getUniqueId()));
                if (musNotice != null) {
                    StringBuilder append = new StringBuilder("filterData find: ").append(next.getUniqueId()).append(", [").append(next.type).append(", ").append(musNotice.type).append("], [").append(C89219l.m154714a(next, musNotice)).append(", ");
                    if (next == musNotice) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C39109f.m79404c("NotificationModel", append.append(z).append(']').toString());
                    if (C89219l.m154714a(next, musNotice)) {
                        listIterator.remove();
                    } else {
                        next.hackUniqueId(next.getUniqueId() + 1);
                    }
                }
                linkedHashMap.put(Long.valueOf(next.getUniqueId()), next);
            }
        }
        return list;
    }

    /* renamed from: a */
    public void mo100434a(MusNotice musNotice) {
        C89219l.m154721d(musNotice, "");
        if (musNotice.isMock()) {
            C39109f.m79404c("NotificationModel", "cannot delete a mock notice:" + musNotice.type + ", " + musNotice.nid);
            return;
        }
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = mo100450k();
        }
        if (!C58029j.f132256h) {
            C39109f.m79404c("NotificationModel", "deleteData net unavailable");
            mo100440f().setValue(C89387v.m154943a(musNotice, EnumC61867b.NET_ERR));
            return;
        }
        C39109f.m79403b("NotificationModel", "deleteData start:" + musNotice.type + ", " + musNotice.nid);
        mo100442h().add(musNotice.nid);
        List<MusNotice> value = mo100431a().getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : value) {
                if (!C89219l.m154714a((Object) ((MusNotice) t).nid, (Object) musNotice.nid)) {
                    arrayList.add(t);
                }
            }
            mo100431a().setValue(arrayList);
        }
        if (musNotice.type == 225) {
            C62259e.m112612a(musNotice);
        }
        AbstractC88412b a = NotificationApi.m111994a().deleteNotice(musNotice.nid).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C62457b(this, musNotice), new C62458c(this, musNotice));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, mo100441g());
    }
}
