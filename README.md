# rider-auth

This is the **authentication module** for the Rider Tracker Android application, designed with **Clean Architecture** and intended for **enterprise-scale modular apps**.

## 🔍 What It Includes

- `auth-contract`: defines interfaces and navigation contracts
- `auth-impl`: contains implementation for login UI, ViewModel, and logic
- Published to Maven for versioned usage in the main application

## 💡 Highlights

- Feature-owned module for **authentication team**
- Follows clean separation of concerns (contract vs impl)
- Designed for multi-team, multi-repo super apps

## 📦 Versioning

Each module is independently versioned and published to GitHub Packages:


## 🧭 Navigation Entry

Start with `LoginScreen`, and communicate via `AuthNavigator` interface.

---

Part of the [Rider Tracker Project](https://github.com/mobileguruvn/android-clean-architecture-multi-repo) — a scalable architecture reference for companies like Uber or Grab.
