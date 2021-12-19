package com.p2082ss.android.ugc.aweme.notification.model;

import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.C1213t;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39159o;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56386j;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61632g;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MessageItem;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61802d;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61964b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.AbstractC89040af;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89266e;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel */
public final class MusNewNotificationModel extends AbstractC39100a<MusNotice, MessageResponse> {
    private final List<NoticeItems> collapseNotices = new ArrayList();
    public String lastGroupApiLogId;
    public final C1213t<NoticeCombineDatas> liveData = new C1213t<>();
    private int mCurrentType = C61530a.C61532b.m111445a();
    private final Map<Integer, List<MusNotice>> mDataMap = new LinkedHashMap();
    private boolean mHasMore;
    private long mLastReadTime;
    private long mMaxTime;
    private long mMinTime;
    public int mTotal;
    public final C1213t<LiveNoticeMessageResponse> updateLiveData = new C1213t<>();

    static {
        Covode.recordClassIndex(72968);
    }

    /* renamed from: com_ss_android_ugc_aweme_notification_model_MusNewNotificationModel_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m112510x22fc132b(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        return this.mHasMore;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<MusNotice> getItems() {
        return getItemsFromGroup(this.mCurrentType);
    }

    public final void startFetchLive() {
        MusNotificationApiManager.f140430a.fetchLiveNotice("tiktok_message", 0, 3, 81).mo5542c(new MusNewNotificationModel$startFetchLive$1(this, SystemClock.elapsedRealtime()));
    }

    public final void setCurrentNoticeGroup(int i) {
        this.collapseNotices.clear();
        this.mCurrentType = i;
    }

    private final void sortByTime(List<MusNotice> list) {
        if (!C13603b.m24435a((Collection) list)) {
            C89070n.m154530a((List) list, (Comparator) MusNewNotificationModel$sortByTime$1.INSTANCE);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 3) {
            return true;
        }
        return false;
    }

    public final List<MusNotice> getItemsFromGroup(int i) {
        List<MusNotice> list = this.mDataMap.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.mDataMap.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        C61964b.m112093d();
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (C61802d.f140289a) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C61632g(intValue, this.mMaxTime, this.mMinTime, 0, 0, 24, null));
            C34608n.m70658a().mo61083a(this.mHandler, new MusNewNotificationModel$loadMoreList$1(arrayList), intValue);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        C61964b.m112093d();
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C61632g(intValue, 0, 0, 0, 0, 30, null));
        C34608n.m70658a().mo61083a(this.mHandler, new MusNewNotificationModel$refreshList$1(this, intValue, arrayList), intValue);
    }

    private final void handleExtractLogId(Message message) {
        this.lastGroupApiLogId = null;
        Object obj = message.obj;
        if (obj != null) {
            try {
                this.lastGroupApiLogId = ((BaseResponse) obj).extra.logid;
                C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            Object obj2 = message.obj;
            if (obj2 != null) {
                try {
                    Object rawResponse = ((C34485a) obj2).getRawResponse();
                    if (rawResponse != null) {
                        this.lastGroupApiLogId = ((BaseResponse) rawResponse).extra.logid;
                        C89379q.m157068constructorimpl(C89391z.f203057a);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
                } catch (Throwable th2) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th2));
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
        }
    }

    private final void tryChangePositionForce(int i) {
        List<MusNotice> itemsFromGroup;
        Object obj;
        if (i == C61530a.C61532b.m111445a() && (itemsFromGroup = getItemsFromGroup(i)) != null && !itemsFromGroup.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = C89266e.C89267a.m154754a(itemsFromGroup.size() - 1, 0, -1).iterator();
            while (it.hasNext()) {
                int a = ((AbstractC89040af) it).mo143429a();
                if (itemsFromGroup.get(a).needForceInsert()) {
                    arrayList.add(itemsFromGroup.get(a));
                    itemsFromGroup.remove(a);
                }
            }
            if (arrayList.size() > 1) {
                C89070n.m154530a((List) arrayList, (Comparator) new MusNewNotificationModel$tryChangePositionForce$$inlined$sortBy$1());
            }
            Iterator it2 = C89271h.m154766a(0, arrayList.size()).iterator();
            while (it2.hasNext()) {
                MusNotice musNotice = (MusNotice) arrayList.get(((AbstractC89040af) it2).mo143429a());
                int min = Math.min(musNotice.lowestPosition - 1, itemsFromGroup.size());
                Iterator it3 = C89271h.m154766a(0, min).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    int intValue = ((Number) obj).intValue();
                    if (itemsFromGroup.get(intValue).lowestPosition == 0 && itemsFromGroup.get(intValue).createTime < musNotice.createTime) {
                        break;
                    }
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    min = num.intValue();
                }
                itemsFromGroup.add(min, musNotice);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message != null) {
            Object obj = message.obj;
            if (!(obj instanceof BaseResponse)) {
                obj = null;
            }
            C56386j.m102361a((BaseResponse) obj);
            handleExtractLogId(message);
            if (message.obj instanceof Exception) {
                m112510x22fc132b("Snow", "exception: ");
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                ((Exception) obj2).printStackTrace();
                if (this.mNotifyListeners != null) {
                    for (AbstractC39159o oVar : this.mNotifyListeners) {
                        Object obj3 = message.obj;
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                        oVar.mo57526a_((Exception) obj3);
                    }
                }
                C61964b.m112087a(message.what, (String) null, message.obj.toString());
                return;
            }
            int i = message.what;
            Long l = C61964b.f140650b;
            if (l != null) {
                C61964b.m112088a("notice_type_list_net", System.currentTimeMillis() - l.longValue(), Integer.valueOf(i));
            }
            C61964b.f140650b = null;
            if (C61802d.f140289a) {
                handleCombineResponse(message);
            }
            if (!(message.obj instanceof MessageResponse)) {
                if (this.mNotifyListeners != null) {
                    for (AbstractC39159o oVar2 : this.mNotifyListeners) {
                        Object obj4 = message.obj;
                        if (!(obj4 instanceof Exception)) {
                            obj4 = null;
                        }
                        oVar2.mo57526a_((Exception) obj4);
                    }
                }
                int i2 = message.what;
                Object obj5 = message.obj;
                C61964b.m112087a(i2, (String) null, obj5 != null ? obj5.toString() : null);
            } else if (message.what == this.mCurrentType) {
                Object obj6 = message.obj;
                Objects.requireNonNull(obj6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                handleData((MessageResponse) obj6, message.what, true);
                if (this.mNotifyListeners != null) {
                    for (AbstractC39159o oVar3 : this.mNotifyListeners) {
                        oVar3.mo57528c();
                    }
                }
            } else {
                Object obj7 = message.obj;
                Objects.requireNonNull(obj7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                handleData((MessageResponse) obj7, message.what, false);
            }
        }
    }

    private final void handleCombineResponse(Message message) {
        MusNotice musNotice;
        List<NoticeItems> notices;
        if (message != null && (message.obj instanceof NoticeListsResponse)) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse");
            NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
            List<NoticeItems> list = this.collapseNotices;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getGroup()));
            }
            List g = C89070n.m154585g((Collection) arrayList);
            List<NoticeItems> collapseNotices2 = noticeListsResponse.getCollapseNotices();
            if (collapseNotices2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : collapseNotices2) {
                    if (!g.contains(Integer.valueOf(t.getGroup()))) {
                        arrayList2.add(t);
                    }
                }
                ArrayList<NoticeItems> arrayList3 = arrayList2;
                this.collapseNotices.addAll(arrayList3);
                ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
                for (NoticeItems noticeItems : arrayList3) {
                    arrayList4.add(Integer.valueOf(noticeItems.getGroup()));
                }
                g.addAll(arrayList4);
            }
            int i = message.what;
            NoticeItems noticeItems2 = null;
            if (i == C61530a.C61532b.m111445a()) {
                if (this.mListQueryType == 1 && (notices = noticeListsResponse.getNotices()) != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (T t2 : notices) {
                        if (t2.getGroup() != C61530a.C61532b.m111445a()) {
                            arrayList5.add(t2);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (!g.contains(Integer.valueOf(((NoticeItems) obj2).getGroup()))) {
                            arrayList6.add(obj2);
                        }
                    }
                    this.collapseNotices.addAll(arrayList6);
                }
                List<NoticeItems> notices2 = noticeListsResponse.getNotices();
                if (notices2 != null) {
                    Iterator<T> it2 = notices2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (next.getGroup() == message.what) {
                            noticeItems2 = next;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            } else if (i == 37) {
                ArrayList arrayList7 = new ArrayList();
                List<NoticeItems> notices3 = noticeListsResponse.getNotices();
                if (notices3 != null) {
                    for (T t3 : notices3) {
                        List<MusNotice> items = t3.getItems();
                        if (!(items == null || (musNotice = (MusNotice) C89070n.m154583g((List) items)) == null)) {
                            arrayList7.add(musNotice);
                            C61630e eVar = musNotice.templateNotice;
                            if (eVar != null) {
                                eVar.f139897m = t3.getGroup();
                            }
                        }
                    }
                }
                noticeItems2 = new NoticeItems(arrayList7, false, 0, 0, 0, 0, message.what, 0, BuildConfig.VERSION_CODE, null);
            } else {
                List<NoticeItems> notices4 = noticeListsResponse.getNotices();
                if (notices4 != null) {
                    Iterator<T> it3 = notices4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next2 = it3.next();
                        if (next2.getGroup() == message.what) {
                            noticeItems2 = next2;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            }
            message.obj = new MessageResponse(new MessageItem(noticeItems2), noticeListsResponse.getLobPb());
        }
    }

    private final void handleCombineData(int i, NoticeItems noticeItems, List<MusNotice> list) {
        MusNotice musNotice;
        MusNotice musNotice2;
        if (noticeItems == null || !noticeItems.getHasMore()) {
            for (T t : this.collapseNotices) {
                List<MusNotice> items = t.getItems();
                if (!(items == null || (musNotice = (MusNotice) C89070n.m154583g((List) items)) == null)) {
                    list.add(musNotice);
                    musNotice.noticeListType = t.getListType();
                    C61630e eVar = musNotice.templateNotice;
                    if (eVar != null) {
                        eVar.f139897m = t.getGroup();
                    }
                }
            }
            this.collapseNotices.clear();
            return;
        }
        Iterator<NoticeItems> it = this.collapseNotices.iterator();
        while (it.hasNext()) {
            NoticeItems next = it.next();
            List<MusNotice> items2 = next.getItems();
            if (!(items2 == null || (musNotice2 = (MusNotice) C89070n.m154583g((List) items2)) == null)) {
                if (musNotice2.createTime >= noticeItems.getMaxTime() || (next.getListType() == 2 && !musNotice2.hasRead)) {
                    list.add(musNotice2);
                    musNotice2.noticeListType = next.getListType();
                    C61630e eVar2 = musNotice2.templateNotice;
                    if (eVar2 != null) {
                        eVar2.f139897m = next.getGroup();
                    }
                    it.remove();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x027a A[LOOP:10: B:164:0x0274->B:166:0x027a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse r10, int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 662
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.model.MusNewNotificationModel.handleData(com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse, int, boolean):void");
    }
}
