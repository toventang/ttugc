package com.p2082ss.android.ugc.aweme.shortvideo.upload.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21984a;
import com.bytedance.retrofit2.p1610b.AbstractC21987aa;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22013u;
import com.bytedance.retrofit2.p1610b.AbstractC22016x;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ttnet.IUploadFileApi */
public interface IUploadFileApi {
    static {
        Covode.recordClassIndex(86666);
    }

    @AbstractC22000h
    AbstractC21983b<String> doGet(@AbstractC21984a boolean z, @AbstractC22007o int i, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22013u
    AbstractC21983b<String> doPut(@AbstractC22007o int i, @AbstractC21994b TypedOutput typedOutput, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22012t
    AbstractC21983b<String> postBody(@AbstractC22007o int i, @AbstractC21994b TypedOutput typedOutput, @AbstractC21993ag String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);

    @AbstractC22012t(mo35799a = "{relativePath}")
    @AbstractC21991ae
    AbstractC21983b<TypedInput> streamingPostCall(@AbstractC21994b TypedOutput typedOutput, @AbstractC22016x(mo35804a = "relativePath") String str, @AbstractC21987aa(mo35781a = true) Map<String, String> map, @AbstractC22004l List<C22027b> list, @AbstractC21996d Object obj);
}
