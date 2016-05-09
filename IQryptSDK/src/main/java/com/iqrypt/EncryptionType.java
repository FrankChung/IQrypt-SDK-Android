/*  IQrypt - encrypt and query your database

    Copyright(C) 2016 Dotissi Development SRL

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.If not, see http://www.gnu.org/licenses/gpl.txt
    */
package com.iqrypt;
public enum EncryptionType
 {
     /// <summary>
     /// Encrypted with AES or Camellia in CBC mode and random IV
     /// </summary>
     RND,
     /// <summary>
     /// Encrypted with AES or Camellia in ECB mode
     /// </summary>
     DET,
     /// <summary>
     /// Encrypted with Order Preserving Encryption algorithm that allows range queries
     /// </summary>
     OPE,
     /// <summary>
     /// Keyed-hashing using SHA-256
     /// </summary>
     HMAC,
     /// <summary>
     /// Randomized order preserving encryption
     /// </summary>
     ROPE,
     /// <summary>
     /// Bitmap indexes for low cardinality tags
     /// </summary>
     BITMAP
 }
