package com.p2082ss.android.ugc.aweme.friends.model;

import android.text.TextUtils;
import com.bytedance.common.utility.C13607d;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.friends.api.FriendApi;
import com.p2082ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p2082ss.android.ugc.aweme.friends.p3014d.C51486a;
import com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51490a;
import com.p2082ss.android.ugc.aweme.net.C61354g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import com.p2082ss.android.ugc.aweme.social.monitor.C74740e;
import com.p2082ss.android.ugc.aweme.utils.C80241be;
import com.p2082ss.android.ugc.aweme.utils.C80577ik;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel */
public class ThirdPartyFriendModel extends AbstractC51490a<Friend> {
    private static Set<String> invitedContacts;
    private final String accessToken;
    private final Long expireTime;
    private final FriendApi friendApi;
    private HashMap<String, ContactModel> hashContactsMap;
    private HashMap<String, String> hashSocialMap;
    public Boolean isNewStyle;
    private final String platform;
    private final int scene;
    private final String secretAccessToken;

    static {
        Covode.recordClassIndex(60929);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51490a
    public void buildFriendItems(FriendList<Friend> friendList) {
    }

    public C1731i<FriendList<Friend>> uploadHashedContacts() {
        return uploadContacts();
    }

    private C1731i<FriendList<Friend>> uploadContacts() {
        AbstractC74739d a = C74740e.f167996b.mo117778a(this.scene, UUID.randomUUID());
        return C1731i.m5640b(new ThirdPartyFriendModel$$Lambda$2(this, a), C1731i.f5562a).mo5542c(new ThirdPartyFriendModel$$Lambda$3(this, a)).mo5532a((AbstractC1729g) new ThirdPartyFriendModel$$Lambda$4(a));
    }

    public ThirdPartyFriendModel(String str) {
        this(str, null, null);
    }

    static final /* synthetic */ C1731i lambda$fetchList$0$ThirdPartyFriendModel(C1731i iVar) {
        if (!iVar.mo5544c()) {
            iVar.getClass();
            return C1731i.m5640b(ThirdPartyFriendModel$$Lambda$5.get$Lambda(iVar), C1731i.f5562a);
        }
        throw iVar.mo5546e();
    }

    private void handleReqId(FriendList<Friend> friendList) {
        if (!(friendList == null || friendList.getFriends() == null)) {
            for (Friend friend : friendList.getFriends()) {
                if (friendList.getLogPbBean() != null) {
                    friend.setRequestId(friendList.getLogPbBean().getImprId());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object lambda$fetchList$1$ThirdPartyFriendModel(C1731i iVar) {
        handleReqId((FriendList) iVar.mo5545d());
        ((FriendList) iVar.mo5545d()).setFriends(sortByFollowStatus(((FriendList) iVar.mo5545d()).getFriends()));
        return iVar.mo5545d();
    }

    private <T extends User> List<Friend> sortByFollowStatus(List<T> list) {
        if (C13603b.m24435a((Collection) list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (T t : list) {
            if (t.getFollowStatus() == 0) {
                arrayList.add(i, Friend.copyFrom(t));
                i++;
            } else if (t.getFollowStatus() == 4) {
                arrayList.add(i2, Friend.copyFrom(t));
            } else if (t.getFollowStatus() == 1) {
                arrayList.add(i3, Friend.copyFrom(t));
                i3++;
            } else {
                arrayList.add(Friend.copyFrom(t));
            }
            i2++;
            i3++;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ UploadContactsResult lambda$uploadContacts$2$ThirdPartyFriendModel(AbstractC74739d dVar) {
        dVar.mo117782a();
        List<ContactModelV2> a = C80241be.m139077a(C17867d.m33078a(), dVar, false);
        if (C13603b.m24435a((Collection) a)) {
            return new UploadContactsResult();
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        for (ContactModelV2 contactModelV2 : a) {
            for (String str : contactModelV2.phoneNumber) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = contactModelV2.name;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    this.hashContactsMap.put(C13607d.m24439a(instance.digest(C80577ik.m139671a(str).getBytes(StandardCharsets.UTF_8))) + C13607d.m24439a(instance.digest(str2.getBytes(StandardCharsets.UTF_8))), new ContactModel(str, str2));
                }
            }
        }
        dVar.mo117787c();
        return UploadContactsApi.m95880a(a, dVar, 1, this.scene);
    }

    public ThirdPartyFriendModel(String str, int i) {
        this(str, null, null, null, i);
    }

    static final /* synthetic */ FriendList lambda$uploadContacts$4$ThirdPartyFriendModel(AbstractC74739d dVar, C1731i iVar) {
        if (iVar.mo5544c()) {
            dVar.mo117783a(iVar.mo5546e());
            dVar.mo117791g();
        }
        return (FriendList) iVar.mo5545d();
    }

    private List<Friend> insertUnRegisteredContacts(List<Friend> list, List<Friend> list2) {
        if (C13603b.m24435a((Collection) list2)) {
            return list;
        }
        if (C13603b.m24435a((Collection) list)) {
            return list2;
        }
        int i = 0;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (list.get(size).getFollowStatus() == 0) {
                i = size + 1;
                break;
            } else {
                size--;
            }
        }
        list.addAll(i, list2);
        return list;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FriendList lambda$uploadContacts$3$ThirdPartyFriendModel(AbstractC74739d dVar, C1731i iVar) {
        String imprId;
        ArrayList arrayList;
        dVar.mo117789e();
        UploadContactsResult uploadContactsResult = (UploadContactsResult) iVar.mo5545d();
        if (((UploadContactsResult) iVar.mo5545d()).logPbBean == null) {
            imprId = "";
        } else {
            imprId = ((UploadContactsResult) iVar.mo5545d()).logPbBean.getImprId();
        }
        List<ContactModel> list = uploadContactsResult.contacts;
        if (!C13603b.m24435a((Collection) list)) {
            arrayList = new ArrayList(list.size());
            int i = 0;
            for (ContactModel contactModel : list) {
                ContactModel contactModel2 = this.hashContactsMap.get(contactModel.phoneNumber + contactModel.name);
                if (contactModel2 != null) {
                    contactModel.phoneNumber = contactModel2.phoneNumber;
                    contactModel.name = contactModel2.name;
                    Friend friend = new Friend(contactModel.phoneNumber);
                    friend.setRequestId(imprId);
                    friend.setNickname(contactModel.name);
                    if (!C51486a.m95903b(contactModel.phoneNumber)) {
                        friend.setInvited(true);
                        arrayList.add(friend);
                    } else {
                        arrayList.add(i, friend);
                        i++;
                    }
                }
            }
        } else {
            arrayList = null;
        }
        List<Friend> sortByFollowStatus = sortByFollowStatus(uploadContactsResult.users);
        if (sortByFollowStatus != null) {
            for (Friend friend2 : sortByFollowStatus) {
                friend2.setRequestId(imprId);
            }
        }
        FriendList friendList = new FriendList();
        friendList.setFriends(insertUnRegisteredContacts(sortByFollowStatus, arrayList));
        SharePrefCache.inst().getIsContactsUploaded().mo59940b(true);
        dVar.mo117790f();
        dVar.mo117791g();
        return friendList;
    }

    public ThirdPartyFriendModel(String str, String str2, String str3) {
        this(str, str2, str3, null, 1);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51490a
    public void fetchList(int i, int i2, int i3) {
        if (this.platform.equals("contact")) {
            uploadContacts().mo5537b(ThirdPartyFriendModel$$Lambda$0.$instance).mo5532a(new C61354g(this.mHandler));
        } else {
            this.friendApi.thirdPartFriends(this.platform, this.accessToken, this.secretAccessToken, this.expireTime, Integer.valueOf(this.scene)).mo5542c(new ThirdPartyFriendModel$$Lambda$1(this)).mo5532a(new C61354g(this.mHandler));
        }
    }

    public ThirdPartyFriendModel(String str, String str2, String str3, Long l, int i) {
        this.isNewStyle = false;
        this.hashContactsMap = new HashMap<>();
        this.hashSocialMap = new HashMap<>();
        this.platform = str;
        this.accessToken = str2;
        this.secretAccessToken = str3;
        this.expireTime = l;
        this.scene = i;
        this.friendApi = (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(FriendApi.class);
    }
}
