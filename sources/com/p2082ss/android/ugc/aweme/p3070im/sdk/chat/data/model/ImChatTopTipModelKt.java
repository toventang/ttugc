package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModelKt */
public final class ImChatTopTipModelKt {
    static {
        Covode.recordClassIndex(63445);
    }

    public static final SystemContent.Key toKey(IMActionTemplate iMActionTemplate) {
        int i;
        String str;
        C89219l.m154721d(iMActionTemplate, "");
        SystemContent.Key key = new SystemContent.Key();
        Integer action = iMActionTemplate.getAction();
        if (action != null) {
            i = action.intValue();
        } else {
            i = -1;
        }
        key.action = i;
        Integer key2 = iMActionTemplate.getKey();
        if (key2 != null) {
            str = String.valueOf(key2.intValue());
        } else {
            str = null;
        }
        key.key = str;
        key.name = iMActionTemplate.getName();
        key.link = iMActionTemplate.getLink();
        return key;
    }

    public static final SystemContent toSystemContent(ImChatTopTipModel imChatTopTipModel) {
        String str;
        IMFromMessageTips msgContent;
        List<IMActionTemplate> template;
        IMFromMessageTips msgContent2;
        C89219l.m154721d(imChatTopTipModel, "");
        SystemContent systemContent = new SystemContent();
        IMNoticeMsgStruct noticeMsgStruct = imChatTopTipModel.getNoticeMsgStruct();
        SystemContent.Key[] keyArr = null;
        if (noticeMsgStruct == null || (msgContent2 = noticeMsgStruct.getMsgContent()) == null) {
            str = null;
        } else {
            str = msgContent2.getTips();
        }
        systemContent.tips = str;
        IMNoticeMsgStruct noticeMsgStruct2 = imChatTopTipModel.getNoticeMsgStruct();
        if (!(noticeMsgStruct2 == null || (msgContent = noticeMsgStruct2.getMsgContent()) == null || (template = msgContent.getTemplate()) == null)) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) template, 10));
            Iterator<T> it = template.iterator();
            while (it.hasNext()) {
                arrayList.add(toKey(it.next()));
            }
            Object[] array = arrayList.toArray(new SystemContent.Key[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            keyArr = (SystemContent.Key[]) array;
        }
        systemContent.template = keyArr;
        return systemContent;
    }
}
