package com.kei.dakomapp.package

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseLecture(

	@field:SerializedName("ResponseLecture")
	val responseLecture: List<ResponseLectureItem?>? = null
) : Parcelable

@Parcelize
data class ResponseLectureItem(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("orginizer_name")
	val orginizerName: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("lecturer")
	val lecturer: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("poster_photo_path")
	val posterPhotoPath: String? = null,

	@field:SerializedName("cp")
	val cp: String? = null,

	@field:SerializedName("form_link")
	val formLink: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("quota")
	val quota: Int? = null,

	@field:SerializedName("group_link")
	val groupLink: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("time")
	val time: String? = null,

	@field:SerializedName("category")
	val category: String? = null
) : Parcelable
