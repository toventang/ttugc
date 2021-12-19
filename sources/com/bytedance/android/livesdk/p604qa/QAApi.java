package com.bytedance.android.livesdk.p604qa;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.qa.QAApi */
public interface QAApi {
    static {
        Covode.recordClassIndex(11714);
    }

    @AbstractC22012t(mo35799a = "/webcast/interaction/question/delete/")
    AbstractC88979t<C5832d> deleteQuestion(@AbstractC22018z(mo35807a = "question_id") long j);

    @AbstractC22012t(mo35799a = "/webcast/interaction/question/answer/end/")
    AbstractC88979t<C5832d> endAnswer(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "question_id") long j2);

    @AbstractC22012t(mo35799a = "/webcast/interaction/question/like/")
    AbstractC88979t<C5832d> likeQuestion(@AbstractC22018z(mo35807a = "question_id") long j, @AbstractC22018z(mo35807a = "like") int i, @AbstractC22018z(mo35807a = "from") int i2);

    @AbstractC22012t(mo35799a = "/webcast/interaction/question/list/")
    AbstractC88979t<C5832d<C10191ai>> queryQuestion(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "unanswered_list_page_num") long j2, @AbstractC22018z(mo35807a = "answered_list_page_num") long j3, @AbstractC22018z(mo35807a = "from") int i);

    @AbstractC22012t(mo35799a = "/webcast/interaction/question/answer/start/")
    AbstractC88979t<C5832d> startAnswer(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "question_id") long j2);

    @AbstractC22012t(mo35799a = "/webcast/interaction/question/submit/")
    @AbstractC21999g
    AbstractC88979t<C5832d> submitQuestion(@AbstractC21997e(mo35786a = "room_id") long j, @AbstractC21997e(mo35786a = "content") String str, @AbstractC21997e(mo35786a = "from") int i, @AbstractC21997e(mo35786a = "post_anyway") int i2);

    @AbstractC22012t(mo35799a = "/webcast/interaction/question/switch/")
    AbstractC88979t<C5832d> switchOn(@AbstractC22018z(mo35807a = "turn_on") long j);
}
