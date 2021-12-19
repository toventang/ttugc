package com.kakao.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class ResponseStringConverter<T> implements ResponseConverter<String, T> {
    public static final ResponseStringConverter<String> IDENTITY_CONVERTER = new ResponseStringConverter<String>() {
        /* class com.kakao.network.response.ResponseStringConverter.C281011 */

        static {
            Covode.recordClassIndex(33964);
        }

        public final String convert(String str) {
            return str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseConverter
        public final /* bridge */ /* synthetic */ String fromArray(JSONArray jSONArray, int i) {
            return ResponseStringConverter.super.fromArray(jSONArray, i);
        }
    };
    public static final ResponseStringConverter<Long> LONG_CONVERTER = new ResponseStringConverter<Long>() {
        /* class com.kakao.network.response.ResponseStringConverter.C281022 */

        static {
            Covode.recordClassIndex(33965);
        }

        public final Long convert(String str) {
            return Long.valueOf(str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseStringConverter, com.kakao.network.response.ResponseConverter
        public final /* bridge */ /* synthetic */ String fromArray(JSONArray jSONArray, int i) {
            return ResponseStringConverter.super.fromArray(jSONArray, i);
        }
    };

    static {
        Covode.recordClassIndex(33963);
    }

    public List<T> convertList(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            return convertList(new JSONArray(str));
        } catch (JSONException e) {
            Logger.m56227w(e.toString());
            return arrayList;
        }
    }

    public List<T> convertList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(convert(fromArray(jSONArray, i)));
        }
        return arrayList;
    }

    @Override // com.kakao.network.response.ResponseConverter
    public String fromArray(JSONArray jSONArray, int i) {
        try {
            return jSONArray.getString(i);
        } catch (JSONException unused) {
            return null;
        }
    }
}
