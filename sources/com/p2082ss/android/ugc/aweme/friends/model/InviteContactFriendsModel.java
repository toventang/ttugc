package com.p2082ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.api.FriendApi;
import com.p2082ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p2082ss.android.ugc.aweme.friends.invite.C51541d;
import com.p2082ss.android.ugc.aweme.friends.invite.C51542e;
import com.p2082ss.android.ugc.aweme.friends.p3014d.C51486a;
import com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51490a;
import com.p2082ss.android.ugc.aweme.net.C61354g;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.social.monitor.C74740e;
import com.p2082ss.android.ugc.aweme.utils.C80227au;
import com.p2082ss.android.ugc.aweme.utils.C80240bd;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.aweme.utils.C80577ik;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel */
public class InviteContactFriendsModel extends AbstractC51490a<Friend> {
    private final FriendApi friendApi;
    private HashMap<String, ContactModel> hashContactsMap;
    public List<Integer> mIndexCounts;
    public List<String> mIndexLetters;
    private int scene;

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$IFetchShareConfigCallback */
    public interface IFetchShareConfigCallback {
        static {
            Covode.recordClassIndex(60902);
        }

        void onFailed();

        void onSuccess(C51542e eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$InviteFriendsCallback */
    public interface InviteFriendsCallback {
        static {
            Covode.recordClassIndex(60903);
        }

        void onFailed(String str);

        void onSuccess();
    }

    static {
        Covode.recordClassIndex(60891);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51490a
    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel$ContactFriend */
    public static class ContactFriend extends Friend {
        String firstName;
        String lastName;
        public int originIndex;
        public String section;
        String url;

        static {
            Covode.recordClassIndex(60901);
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getOriginIndex() {
            return this.originIndex;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.model.Friend
        public String getSection() {
            return this.section;
        }

        public String getUrl() {
            return this.url;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.model.Friend, com.p2082ss.android.ugc.aweme.profile.model.User
        public int hashCode() {
            return super.hashCode();
        }

        public ContactFriend(String str) {
            super(str);
        }

        public void setFirstName(String str) {
            this.firstName = str;
        }

        public void setLastName(String str) {
            this.lastName = str;
        }

        public void setOriginIndex(int i) {
            this.originIndex = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.model.Friend
        public void setSection(String str) {
            this.section = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.model.Friend, com.p2082ss.android.ugc.aweme.profile.model.User
        public boolean equals(Object obj) {
            if (!(obj instanceof ContactFriend)) {
                return false;
            }
            Friend friend = (Friend) obj;
            if (!TextUtils.equals(getSocialName(), friend.getSocialName()) || !TextUtils.equals(getNickname(), friend.getNickname())) {
                return false;
            }
            return true;
        }
    }

    public InviteContactFriendsModel(String str) {
        this(str, 1);
    }

    public void fetchShareConfig(IFetchShareConfigCallback iFetchShareConfigCallback) {
        C1731i.m5640b(new InviteContactFriendsModel$$Lambda$6(this, iFetchShareConfigCallback), C1731i.f5562a);
    }

    public C51541d shortenUrl(String str) {
        return AbstractC51474a.m95881a().shortenUrl(str).get();
    }

    static final /* synthetic */ C1731i lambda$fetchList$0$InviteContactFriendsModel(C1731i iVar) {
        if (!iVar.mo5544c()) {
            iVar.getClass();
            return C1731i.m5640b(InviteContactFriendsModel$$Lambda$8.get$Lambda(iVar), C1731i.f5562a);
        }
        throw iVar.mo5546e();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$fetchShareConfig$7$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback) {
        try {
            C51542e eVar = AbstractC51474a.m95881a().getInviteContactFriendsSettings().get();
            if (eVar != null) {
                this.mHandler.post(new InviteContactFriendsModel$$Lambda$7(iFetchShareConfigCallback, eVar));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void encodeAndAddToCache(C80240bd bdVar) {
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        this.hashContactsMap.clear();
        int i = 0;
        for (ContactModelV2 contactModelV2 : bdVar.f179720a) {
            for (String str : contactModelV2.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = contactModelV2.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    contactModel.url = contactModelV2.mImageUrl;
                    contactModel.firstName = contactModelV2.givenName;
                    contactModel.lastName = contactModelV2.familyName;
                    contactModel.originIndex = i;
                    contactModel.mSection = contactModelV2.section;
                    contactModel.photoUri = contactModelV2.photoUri;
                    this.hashContactsMap.put(C13607d.m24439a(instance.digest(C80577ik.m139671a(str).getBytes(StandardCharsets.UTF_8))) + C13607d.m24439a(instance.digest(str2.getBytes(StandardCharsets.UTF_8))), contactModel);
                }
            }
            i++;
        }
    }

    private void filterInvalidVal(List<ContactModelV2> list) {
        Iterator<ContactModelV2> it = list.iterator();
        while (it.hasNext()) {
            ContactModelV2 next = it.next();
            if (C13627m.m24498a(next.name) || next.phoneNumber.isEmpty()) {
                it.remove();
            } else {
                Iterator<String> it2 = next.phoneNumber.iterator();
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    try {
                        if (C13627m.m24498a(next2)) {
                            it2.remove();
                        } else if (next2.charAt(0) == '+') {
                            if (!PhoneNumberUtil.getInstance().isPossibleNumber(next2, null)) {
                                it2.remove();
                            }
                        } else if (next2.length() < 2 || next2.length() > 17 || !next2.matches("[0-9.-]+")) {
                            it2.remove();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (next.phoneNumber.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    private void sortWithContactIndex(List<ContactFriend> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ContactFriend> it = list.iterator();
        while (it.hasNext()) {
            ContactFriend next = it.next();
            if (TextUtils.equals(next.section, "#") || TextUtils.equals(next.section, "…") || next.section == null || TextUtils.isEmpty(next.section.trim())) {
                it.remove();
                next.setSection("#");
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList, InviteContactFriendsModel$$Lambda$4.$instance);
        Collections.sort(list, InviteContactFriendsModel$$Lambda$5.$instance);
        list.addAll(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ContactFriend contactFriend : list) {
            if (contactFriend != null) {
                String section = contactFriend.getSection();
                if (!linkedHashMap.containsKey(section)) {
                    linkedHashMap.put(section, 1);
                } else {
                    linkedHashMap.put(section, Integer.valueOf(((Integer) linkedHashMap.get(section)).intValue() + 1));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            arrayList2.add(obj);
            arrayList3.add(linkedHashMap.get(obj));
        }
        this.mIndexLetters = arrayList2;
        this.mIndexCounts = arrayList3;
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$5$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        return contactFriend.originIndex - contactFriend2.originIndex;
    }

    static final /* synthetic */ void lambda$null$6$InviteContactFriendsModel(IFetchShareConfigCallback iFetchShareConfigCallback, C51542e eVar) {
        if (iFetchShareConfigCallback == null) {
            return;
        }
        if (eVar != null) {
            iFetchShareConfigCallback.onSuccess(eVar);
        } else {
            iFetchShareConfigCallback.onFailed();
        }
    }

    static final /* synthetic */ FriendList lambda$uploadContacts$3$InviteContactFriendsModel(AbstractC74739d dVar, C1731i iVar) {
        if (iVar.mo5544c()) {
            dVar.mo117783a(iVar.mo5546e());
            dVar.mo117791g();
        }
        return (FriendList) iVar.mo5545d();
    }

    public InviteContactFriendsModel(String str, int i) {
        this.scene = 1;
        this.hashContactsMap = new HashMap<>();
        this.mIndexLetters = new ArrayList();
        this.mIndexCounts = new ArrayList();
        this.friendApi = (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(FriendApi.class);
        this.scene = i;
    }

    private void sort(C80240bd bdVar, List<ContactFriend> list) {
        if (!C13603b.m24435a((Collection) list)) {
            if (bdVar.f179722c == null || bdVar.f179721b == null) {
                if (C80398en.m139371b()) {
                    for (ContactFriend contactFriend : list) {
                        contactFriend.setSection(C80227au.m139057a(contactFriend.getNickname()));
                    }
                } else {
                    return;
                }
            }
            sortWithContactIndex(list);
        }
    }

    public C1731i<FriendList<ContactFriend>> uploadContacts(boolean z, int i) {
        AtomicReference atomicReference = new AtomicReference();
        AbstractC74739d a = C74740e.f167996b.mo117778a(i, UUID.randomUUID());
        return C1731i.m5640b(new InviteContactFriendsModel$$Lambda$1(this, a, atomicReference, z, i), C1731i.f5562a).mo5542c(new InviteContactFriendsModel$$Lambda$2(this, a, atomicReference)).mo5532a((AbstractC1729g) new InviteContactFriendsModel$$Lambda$3(a));
    }

    static final /* synthetic */ int lambda$sortWithContactIndex$4$InviteContactFriendsModel(ContactFriend contactFriend, ContactFriend contactFriend2) {
        int i;
        int i2;
        char charAt = contactFriend.getNickname().toLowerCase().charAt(0);
        char charAt2 = contactFriend2.getNickname().toLowerCase().charAt(0);
        if (charAt < 'a' || charAt > 'z') {
            if (charAt2 >= 'a' && charAt2 <= 'z') {
                return 1;
            }
            if (charAt < '0' || charAt > '9') {
                if (charAt2 >= '0' && charAt2 <= '9') {
                    return 1;
                }
                i = contactFriend.originIndex;
                i2 = contactFriend2.originIndex;
            } else if (charAt2 < '0' || charAt2 > '9') {
                return -1;
            } else {
                return charAt - charAt2;
            }
        } else if (charAt2 < 'a' || charAt2 > 'z') {
            return -1;
        } else {
            i = contactFriend.originIndex;
            i2 = contactFriend2.originIndex;
        }
        return i - i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51490a
    public void fetchList(int i, int i2, int i3) {
        uploadContacts(false, this.scene).mo5537b(InviteContactFriendsModel$$Lambda$0.$instance).mo5532a(new C61354g(this.mHandler));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$uploadContacts$2$InviteContactFriendsModel(AbstractC74739d dVar, AtomicReference atomicReference, C1731i iVar) {
        ArrayList arrayList;
        dVar.mo117789e();
        List<ContactModel> list = ((UploadContactsResult) iVar.mo5545d()).contacts;
        if (!C13603b.m24435a((Collection) list)) {
            arrayList = new ArrayList(list.size());
            int i = 0;
            for (ContactModel contactModel : list) {
                ContactModel contactModel2 = this.hashContactsMap.get(contactModel.phoneNumber + contactModel.name);
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                    ContactFriend contactFriend = new ContactFriend(contactModel.phoneNumber);
                    contactFriend.setNickname(contactModel.name);
                    contactFriend.setFirstName(contactModel2.firstName);
                    contactFriend.setLastName(contactModel2.lastName);
                    contactFriend.setOriginIndex(contactModel2.originIndex);
                    contactFriend.setSection(contactModel2.mSection);
                    contactFriend.setPhotoUri(contactModel2.photoUri);
                    String str = contactModel2.url;
                    if (!C13627m.m24498a(str)) {
                        UrlModel urlModel = new UrlModel();
                        urlModel.setHeight(-1);
                        urlModel.setWidth(-1);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(str);
                        urlModel.setUrlList(arrayList2);
                        contactFriend.setAvatarThumb(urlModel);
                    }
                    if (!arrayList.contains(contactFriend)) {
                        if (!C51486a.m95903b(contactModel.phoneNumber)) {
                            contactFriend.setInvited(true);
                            arrayList.add(contactFriend);
                        } else {
                            arrayList.add(i, contactFriend);
                            i++;
                        }
                    }
                }
            }
        } else {
            arrayList = null;
        }
        FriendList friendList = new FriendList();
        sort((C80240bd) atomicReference.get(), arrayList);
        friendList.setFriends(arrayList);
        dVar.mo117790f();
        dVar.mo117791g();
        return friendList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$1$InviteContactFriendsModel(AbstractC74739d dVar, AtomicReference atomicReference, boolean z, int i) {
        dVar.mo117782a();
        atomicReference.set(C80241be.m139076a(C17867d.m33078a(), dVar, "sort_key", true, false, z));
        List<ContactModelV2> list = ((C80240bd) atomicReference.get()).f179720a;
        filterInvalidVal(list);
        dVar.mo117786b();
        if (C13603b.m24435a((Collection) list)) {
            return new UploadContactsResult();
        }
        encodeAndAddToCache((C80240bd) atomicReference.get());
        dVar.mo117787c();
        if (C13603b.m24435a((Collection) list)) {
            return new UploadContactsResult();
        }
        return UploadContactsApi.m95880a(list, dVar, 1, i);
    }
}
