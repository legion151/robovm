/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coretext;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreText") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/ 
    extends /*<extends>*/NSErrorUserInfoKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CTFontManagerErrorUserInfoKey toObject(Class<CTFontManagerErrorUserInfoKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CTFontManagerErrorUserInfoKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CTFontManagerErrorUserInfoKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CTFontManagerErrorUserInfoKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CTFontManagerErrorUserInfoKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CTFontManagerErrorUserInfoKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CTFontManagerErrorUserInfoKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CTFontManagerErrorUserInfoKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CTFontManagerErrorUserInfoKey FontURLs = new CTFontManagerErrorUserInfoKey("FontURLs");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CTFontManagerErrorUserInfoKey FontDescriptors = new CTFontManagerErrorUserInfoKey("FontDescriptors");
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final CTFontManagerErrorUserInfoKey FontAssetName = new CTFontManagerErrorUserInfoKey("FontAssetName");
    /*</constants>*/
    
    private static /*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/[] values = new /*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/[] {/*<value_list>*/FontURLs, FontDescriptors, FontAssetName/*</value_list>*/};
    
    /*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CTFontManagerErrorUserInfoKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreText") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCTFontManagerErrorFontURLsKey", optional=true)
        public static native NSString FontURLs();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCTFontManagerErrorFontDescriptorsKey", optional=true)
        public static native NSString FontDescriptors();
        /**
         * @since Available in iOS 13.0 and later.
         */
        @GlobalValue(symbol="kCTFontManagerErrorFontAssetNameKey", optional=true)
        public static native NSString FontAssetName();
        /*</values>*/
    }
}
